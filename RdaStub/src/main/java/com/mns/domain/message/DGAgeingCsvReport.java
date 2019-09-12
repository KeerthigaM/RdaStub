package com.mns.domain.message;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder(value = { "upc", "articleDescription", "vendorNo", "categories", "multiSupply", "creationDate", "workflowId", "ragStatus", "reasonCode", "supplierName", "costPriceLength", "supplyChainLength", "equipmentLength", "unitWeightLength", "pendingWith", "workflowStatus"})
public class DGAgeingCsvReport {
	
	private String upc;
	private String articleDescription;
	private String vendorNo;
	private String categories;
	private String multiSupply;
	private String creationDate;
	private String workflowId;
	private String ragStatus;	
	private String reasonCode;
	private String supplierName;
	private String costPriceLength;
	private String supplyChainLength;
	private String equipmentLength;
	private String unitWeightLength;
	private String pendingWith;
	private String workflowStatus;

	public String getUpc() {
		return upc;
	}

	public void setUpc(final String upc) {
		this.upc = upc;
	}

	public String getMultiSupply() {
		return multiSupply;
	}

	public void setMultiSupply(final String multiSupply) {
		this.multiSupply = multiSupply;
	}

	public String getRagStatus() {
		return ragStatus;
	}

	public void setRagStatus(final String ragStatus) {
		this.ragStatus = ragStatus;
	}

	public String getWorkflowStatus() {
		return workflowStatus;
	}

	public void setWorkflowStatus(final String workflowStatus) {
		this.workflowStatus = workflowStatus;
	}

	public String getArticleDescription() {
		return articleDescription;
	}

	public void setArticleDescription(final String articleDescription) {
		this.articleDescription = articleDescription;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(final String creationDate) {
		this.creationDate = creationDate;
	}

	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(final String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(final String categories) {
		this.categories = categories;
	}

	public String getWorkflowId() {
		return workflowId;
	}

	public void setWorkflowId(final String workflowId) {
		this.workflowId = workflowId;
	}

	public String getVendorNo() {
		return vendorNo;
	}

	public void setVendorNo(final String vendorNo) {
		this.vendorNo = vendorNo;
	}

	public String getPendingWith() {
		return pendingWith;
	}

	public void setPendingWith(String pendingWith) {
		this.pendingWith = pendingWith;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(final String supplierName) {
		this.supplierName = supplierName;
	}
	

	public String getCostPriceLength() {
		return costPriceLength;
	}

	public void setCostPriceLength(String costPriceLength) {
		this.costPriceLength = costPriceLength;
	}

	public String getSupplyChainLength() {
		return supplyChainLength;
	}

	public void setSupplyChainLength(String supplyChainLength) {
		this.supplyChainLength = supplyChainLength;
	}

	public String getEquipmentLength() {
		return equipmentLength;
	}

	public void setEquipmentLength(String equipmentLength) {
		this.equipmentLength = equipmentLength;
	}

	public String getUnitWeightLength() {
		return unitWeightLength;
	}

	public void setUnitWeightLength(String unitWeightLength) {
		this.unitWeightLength = unitWeightLength;
	}

	@Override
	public String toString() {
		return "DGAgeingCsvReport{" +
				"upc='" + upc + '\'' + 
				", articleDescription='" + articleDescription + '\'' + 
				", vendorNo='" + vendorNo + '\'' + 
				", categories='" + categories + '\'' + 
				", multiSupply='" + multiSupply + '\'' + 
				", creationDate='" + creationDate + '\'' + 
				", workflowId='" + workflowId + '\'' + 
				", ragStatus='" + ragStatus + '\'' + 
				", reasonCode='" + reasonCode + '\'' + 
				", supplierName='" + supplierName + '\'' + 
				", costPriceLength='" + costPriceLength + '\'' + 
				", supplyChainLength='" + supplyChainLength + '\'' + 
				", equipmentLength='" + equipmentLength + '\'' + 
				", unitWeightLength='" + unitWeightLength + '\'' + 
				", pendingWith='" + pendingWith + '\'' + 
				", workflowStatus='" + workflowStatus + '\'' +
				'}';
	}

	

}
