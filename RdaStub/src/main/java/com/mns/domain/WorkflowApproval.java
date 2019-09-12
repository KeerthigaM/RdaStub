package com.mns.domain;

import java.util.Arrays;

public class WorkflowApproval extends MuleWorkflowApproval {

	private String upc;
	private String productDescription;
	// supplier ID
	private String requestor;
	private String creationDate;
	private String categoryCode;
	private CostPriceChange[] costPrice;
	private SupplyChainChange[] supplyChain;
	private String multiSupply;
	private String multistage;
	private String deliveryMethod;
	private String supplierName;
	private String vendorNo;
	
	public String getUpc() {
		return upc;
	}

	public void setUpc(final String upc) {
		this.upc = upc;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(final String productDescription) {
		this.productDescription = productDescription;
	}

	public String getRequestor() {
		return requestor;
	}

	public void setRequestor(final String requestor) {
		this.requestor = requestor;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(final String creationDate) {
		this.creationDate = creationDate;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(final String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public CostPriceChange[] getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(CostPriceChange[] costPrice) {
		this.costPrice = costPrice;
	}

	public SupplyChainChange[] getSupplyChain() {
		return supplyChain;
	}

	public void setSupplyChain(SupplyChainChange[] supplyChain) {
		this.supplyChain = supplyChain;
	}


	public String getMultiSupply() {
		return multiSupply;
	}

	public void setMultiSupply(String multiSupply) {
		this.multiSupply = multiSupply;
	}

	public String getMultistage() {
		return multistage;
	}

	public void setMultistage(String multistage) {
		this.multistage = multistage;
	}

	public String getDeliveryMethod() {
		return deliveryMethod;
	}

	public void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getVendorNo() {
		return vendorNo;
	}

	public void setVendorNo(String vendorNo) {
		this.vendorNo = vendorNo;
	}

	@Override
	public String toString() {
		return "WorkflowApproval{" +
				"upc='" + upc + '\'' +
				", productDescription='" + productDescription + '\'' +
				", requestor='" + requestor + '\'' +
				", creationDate='" + creationDate + '\'' +
				", categoryCode='" + categoryCode + '\'' +
				", costPrice=" + Arrays.toString(costPrice) +
				", supplyChain=" + Arrays.toString(supplyChain) +
				", multiSupply='" + multiSupply + '\'' +
				", multistage='" + multistage + '\'' +
				", deliveryMethod='" + deliveryMethod + '\'' +
				", supplierName='" + supplierName + '\'' +
				", vendorNo='" + vendorNo + '\'' +
				'}';
	}
}
