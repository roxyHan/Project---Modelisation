/**
 */
package callgraph.impl;

import callgraph.CallgraphPackage;
import callgraph.Edge;
import callgraph.Node;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link callgraph.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link callgraph.impl.NodeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link callgraph.impl.NodeImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link callgraph.impl.NodeImpl#getStructWeight <em>Struct Weight</em>}</li>
 *   <li>{@link callgraph.impl.NodeImpl#getIncoming_edges <em>Incoming edges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends EObjectImpl implements Node {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackage() <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected String package_ = PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStructWeight() <em>Struct Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructWeight()
	 * @generated
	 * @ordered
	 */
	protected static final int STRUCT_WEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStructWeight() <em>Struct Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructWeight()
	 * @generated
	 * @ordered
	 */
	protected int structWeight = STRUCT_WEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncoming_edges() <em>Incoming edges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming_edges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> incoming_edges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CallgraphPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CallgraphPackage.NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CallgraphPackage.NODE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackage(String newPackage) {
		String oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CallgraphPackage.NODE__PACKAGE, oldPackage, package_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStructWeight() {
		return structWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStructWeight(int newStructWeight) {
		int oldStructWeight = structWeight;
		structWeight = newStructWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CallgraphPackage.NODE__STRUCT_WEIGHT, oldStructWeight, structWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Edge> getIncoming_edges() {
		if (incoming_edges == null) {
			incoming_edges = new EObjectResolvingEList<Edge>(Edge.class, this, CallgraphPackage.NODE__INCOMING_EDGES);
		}
		return incoming_edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CallgraphPackage.NODE__NAME:
				return getName();
			case CallgraphPackage.NODE__CLASS:
				return getClass_();
			case CallgraphPackage.NODE__PACKAGE:
				return getPackage();
			case CallgraphPackage.NODE__STRUCT_WEIGHT:
				return getStructWeight();
			case CallgraphPackage.NODE__INCOMING_EDGES:
				return getIncoming_edges();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CallgraphPackage.NODE__NAME:
				setName((String)newValue);
				return;
			case CallgraphPackage.NODE__CLASS:
				setClass((String)newValue);
				return;
			case CallgraphPackage.NODE__PACKAGE:
				setPackage((String)newValue);
				return;
			case CallgraphPackage.NODE__STRUCT_WEIGHT:
				setStructWeight((Integer)newValue);
				return;
			case CallgraphPackage.NODE__INCOMING_EDGES:
				getIncoming_edges().clear();
				getIncoming_edges().addAll((Collection<? extends Edge>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CallgraphPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CallgraphPackage.NODE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case CallgraphPackage.NODE__PACKAGE:
				setPackage(PACKAGE_EDEFAULT);
				return;
			case CallgraphPackage.NODE__STRUCT_WEIGHT:
				setStructWeight(STRUCT_WEIGHT_EDEFAULT);
				return;
			case CallgraphPackage.NODE__INCOMING_EDGES:
				getIncoming_edges().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CallgraphPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CallgraphPackage.NODE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case CallgraphPackage.NODE__PACKAGE:
				return PACKAGE_EDEFAULT == null ? package_ != null : !PACKAGE_EDEFAULT.equals(package_);
			case CallgraphPackage.NODE__STRUCT_WEIGHT:
				return structWeight != STRUCT_WEIGHT_EDEFAULT;
			case CallgraphPackage.NODE__INCOMING_EDGES:
				return incoming_edges != null && !incoming_edges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", class: ");
		result.append(class_);
		result.append(", package: ");
		result.append(package_);
		result.append(", structWeight: ");
		result.append(structWeight);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public boolean equals(Object o) {
	    if (o == this)
	        return true;
	    if (!(o instanceof Node))
	        return false;
	    Node other = (Node)o;
	    boolean nameEquals = (this.name == null && other.getName() == null)
	      || (this.name != null && this.name.equals(other.getName()));
	    
	    boolean classEquals = (this.class_ == null && other.getClass_() == null)
	  	      || (this.class_ != null && this.class_.equals(other.getClass_()));
	    
	    boolean packageEquals = (this.package_ == null && other.getPackage() == null)
	  	      || (this.package_ != null && this.package_.equals(other.getPackage()));
	    
	    return nameEquals && classEquals && packageEquals;
	}
	
	 @Override
	 public int hashCode() {
		 int result = 17;
	     result = 31 * result + name.hashCode();
	     result = 31 * result + class_.hashCode();
	     result = 31 * result + package_.hashCode();
	     return result;
	 }
	 
} //NodeImpl
