/**
 * 
 */
package classD;

import java.util.Set;


public class order {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private customer customer;

	/** 
	 * @return the customer
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public customer getCustomer() {
		// begin-user-code
		return customer;
		// end-user-code
	}

	/** 
	 * @param customer the customer to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setCustomer(customer customer) {
		// begin-user-code
		this.customer = customer;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private bill bill;

	/** 
	 * @return the bill
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public bill getBill() {
		// begin-user-code
		return bill;
		// end-user-code
	}

	/** 
	 * @param bill the bill to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setBill(bill bill) {
		// begin-user-code
		this.bill = bill;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Status orderSatus;

	/** 
	 * @return the orderSatus
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Status getOrderSatus() {
		// begin-user-code
		return orderSatus;
		// end-user-code
	}

	/** 
	 * @param orderSatus the orderSatus to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setOrderSatus(Status orderSatus) {
		// begin-user-code
		this.orderSatus = orderSatus;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer total;

	/** 
	 * @return the total
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Integer getTotal() {
		// begin-user-code
		return total;
		// end-user-code
	}

	/** 
	 * @param total the total to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setTotal(Integer total) {
		// begin-user-code
		this.total = total;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Date pacementDate;

	/** 
	 * @return the pacementDate
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Date getPacementDate() {
		// begin-user-code
		return pacementDate;
		// end-user-code
	}

	/** 
	 * @param pacementDate the pacementDate to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setPacementDate(Date pacementDate) {
		// begin-user-code
		this.pacementDate = pacementDate;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer orderNum;

	/** 
	 * @return the orderNum
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Integer getOrderNum() {
		// begin-user-code
		return orderNum;
		// end-user-code
	}

	/** 
	 * @param orderNum the orderNum to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setOrderNum(Integer orderNum) {
		// begin-user-code
		this.orderNum = orderNum;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer shippingID;

	/** 
	 * @return the shippingID
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Integer getShippingID() {
		// begin-user-code
		return shippingID;
		// end-user-code
	}

	/** 
	 * @param shippingID the shippingID to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setShippingID(Integer shippingID) {
		// begin-user-code
		this.shippingID = shippingID;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private shippingInfo order;

	/** 
	 * @return the order
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public shippingInfo getOrder() {
		// begin-user-code
		return order;
		// end-user-code
	}

	/** 
	 * @param order the order to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setOrder(shippingInfo order) {
		// begin-user-code
		this.order = order;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Set<orderline> orderline;

	/** 
	 * @return the orderline
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Set<orderline> getOrderline() {
		// begin-user-code
		return orderline;
		// end-user-code
	}

	/** 
	 * @param orderline the orderline to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setOrderline(Set<orderline> orderline) {
		// begin-user-code
		this.orderline = orderline;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void placeOrder() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
}