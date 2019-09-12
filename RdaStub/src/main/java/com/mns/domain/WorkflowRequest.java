package com.mns.domain;

/**
 * This class holds parameters that can be sent from the front end to use in Spring, but not affect the call to Mule. These are extra details to populate the email notifications.
 */
public class WorkflowRequest extends MuleWorkflowRequest {

	/** Category code e.g. F24 */
	private String categoryId;
	/** Category name e.g. Meat */
	private String categoryName;
	/** Vendor company name e.g. Bakkavor */
	private String vendorName;
	/** Description of the product e.g. Sirloin of Beef */
	private String productDescription;
	/** Vendor selects buyerId of whom to notify */
	private String assignedBuyer;

	private String productUnitType;

	private String currentProductType;
	
	private String deliveryMethod;

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(final String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(final String categoryName) {
		this.categoryName = categoryName;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(final String vendorName) {
		this.vendorName = vendorName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(final String productDescription) {
		this.productDescription = productDescription;
	}

	public String getAssignedBuyer() {
		return assignedBuyer;
	}

	public void setAssignedBuyer(final String assignedBuyer) {
		this.assignedBuyer = assignedBuyer;
	}

	public String getProductUnitType() {
		return productUnitType;
	}

	public void setProductUnitType(final String productUnitType) {
		this.productUnitType = productUnitType;
	}

	public String getCurrentProductType() {
		return currentProductType;
	}

	public void setCurrentProductType(final String currentProductType) {
		this.currentProductType = currentProductType;
	}

	public String getDeliveryMethod() {
		return deliveryMethod;
	}

	public void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}

	@Override
	public String toString() {
		return "WorkflowRequest{" +
				"categoryId='" + categoryId + '\'' +
				", categoryName='" + categoryName + '\'' +
				", vendorName='" + vendorName + '\'' +
				", productDescription='" + productDescription + '\'' +
				", assignedBuyer='" + assignedBuyer + '\'' +
				", productUnitType='" + productUnitType + '\'' +
				", currentProductType='" + currentProductType + '\'' +
				", deliveryMethod='" + deliveryMethod + '\'' +
				'}';
	}
}
