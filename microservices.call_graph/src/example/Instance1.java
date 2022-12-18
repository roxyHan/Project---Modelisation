package example;

import java.io.*;
import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import callgraph.CallGraph;
import callgraph.CallgraphFactory;
import callgraph.Edge;
import callgraph.Node;
import java.util.*;


public class Instance1 {

	private static final String XMI_FILE = "str.xmi";
	private static final String FILENAME = "C:\\Users\\Hanifa\\epsilon-Interim\\workspace\\microservices.call_graph\\src\\example\\acks_trace_clean.log.filter";
	
	public Instance1() {
		
	}
	
	
	public static void main(String[] args) throws IOException {
		CallgraphFactory cgFactory = CallgraphFactory.eINSTANCE;
		CallGraph graph = cgFactory.createCallGraph();
		// Adding the parser
		File file = new File(FILENAME);
	    Scanner sc = new Scanner(file);
	    String line = "";
	    while (sc.hasNext()) {
            line = sc.nextLine().trim();
            String[] elements = line.split(":");
            String direction = elements[0].trim();
            String raw_data = elements[1].trim(); //raw data containing key information
            
            String[] full_method = raw_data.split("\\(");
            String[] object_data = full_method[0].split("\\."); // method + class + package info
            String method_name = object_data[(object_data.length) - 1];
            String class_name = object_data[(object_data.length) - 2];
            String package_name = object_data[(object_data.length) - 3];
            
            // Gathering info 
            Node aNode = cgFactory.createNode();
    		aNode.setName(method_name);
    		aNode.setClass(class_name);
    		aNode.setPackage(package_name);
    		
    		
    		//
    		//
            if (direction.equals("Entered")) {
            	List<Node> nodelist = graph.getNodes();
            	
            	// If the graph contains at least one node, we can draw the corresponding edge
	    		// starting with the current node being the target and the previous one being the source node
	    		if (graph.getNodes().size() > 0) {
	    			Edge latestEdge = graph.getEdges().get(graph.getEdges().size() -1);
	    			latestEdge.setTarget(method_name);
	    			aNode.getIncoming_edges().add(latestEdge);
	    			aNode.setStructWeight(aNode.getStructWeight() + 1);   	
	    			
	    			int idx = getIdx(nodelist, aNode);

	    			if (idx == -1) {
	    				graph.getNodes().add(aNode);
	    			}
	    			// the node already exists, update the incoming edges & struct weight
	    			else {
	    				graph.getNodes().get(idx).setStructWeight(graph.getNodes().get(idx).getStructWeight() + 1);
	    				graph.getNodes().get(idx).getIncoming_edges().add(latestEdge);
	    			}
	    		}
	    		else { // add the first node
	    			graph.getNodes().add(aNode);
	    		}
            	
	    		
	
	    	}
            // Create an edge element when exiting a method
            else if (direction.equals("Exited")) {
            	Edge edge = cgFactory.createEdge();
            	edge.setSrc(method_name);
            	edge.setName(method_name);
            	graph.getEdges().add(edge);
            }
	    }
	    	
	    // Close the scanner
	    sc.close();
	    
	    
	    //
	    ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		URI fileURI = URI.createFileURI(new File(XMI_FILE).getAbsolutePath());
		System.out.println(fileURI);
		Resource resource = resourceSet.createResource(fileURI);
		resource.getContents().add(graph);
		resource.save(System.out, Collections.EMPTY_MAP);
		resource.save(Collections.EMPTY_MAP);
	}
	
	/**
	 * Check whether the graph contains a node based on some criteria
	 */
	public static boolean containsNode(List<Node> nodes, Node oneNode) { 
		for (Node current : nodes) {
			if (current.equals(oneNode)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 
	 */
	public static int getIdx(List<Node> nodes, Node oneNode) {
		for (int i = 0; i < nodes.size(); i++) {
			Node current = nodes.get(i);
			if (current.equals(oneNode)) {
				return i;
			}
		}
		return -1;
	}

	
}
