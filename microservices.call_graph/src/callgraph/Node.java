/**
 */
package callgraph;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link callgraph.Node#getName <em>Name</em>}</li>
 *   <li>{@link callgraph.Node#getClass_ <em>Class</em>}</li>
 *   <li>{@link callgraph.Node#getPackage <em>Package</em>}</li>
 *   <li>{@link callgraph.Node#getStructWeight <em>Struct Weight</em>}</li>
 *   <li>{@link callgraph.Node#getIncoming_edges <em>Incoming edges</em>}</li>
 * </ul>
 *
 * @see callgraph.CallgraphPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see callgraph.CallgraphPackage#getNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link callgraph.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see callgraph.CallgraphPackage#getNode_Class()
	 * @model required="true"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link callgraph.Node#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' attribute.
	 * @see #setPackage(String)
	 * @see callgraph.CallgraphPackage#getNode_Package()
	 * @model required="true"
	 * @generated
	 */
	String getPackage();

	/**
	 * Sets the value of the '{@link callgraph.Node#getPackage <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' attribute.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(String value);

	/**
	 * Returns the value of the '<em><b>Struct Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struct Weight</em>' attribute.
	 * @see #setStructWeight(int)
	 * @see callgraph.CallgraphPackage#getNode_StructWeight()
	 * @model required="true"
	 * @generated
	 */
	int getStructWeight();

	/**
	 * Sets the value of the '{@link callgraph.Node#getStructWeight <em>Struct Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Struct Weight</em>' attribute.
	 * @see #getStructWeight()
	 * @generated
	 */
	void setStructWeight(int value);
	
	
	@Override
	boolean equals(Object o);

	@Override
	int hashCode() ;
	
	
	/**
	 * Returns the value of the '<em><b>Incoming edges</b></em>' reference list.
	 * The list contents are of type {@link callgraph.Edge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming edges</em>' reference list.
	 * @see callgraph.CallgraphPackage#getNode_Incoming_edges()
	 * @model
	 * @generated
	 */
	EList<Edge> getIncoming_edges();

} // Node
