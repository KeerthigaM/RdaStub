package com.mns.domain;

import java.util.Arrays;
import java.util.List;

public class Workflow {

	private String categories;
	private String articleNo;
	private String articleDescription;
	private String unitDescription;
	private String upc;
	private String multiSupply;
	private String vendorName;
	private String ragStatus;
	private String vendorNo;
	private String currency;
	private String workflowStatus;
	private String requestor;
	private String creationDate;
	private String creationTime;
	private String workflowId;
	private String workflowTitle;
	private String reasonCode;
	private String role;
	private CostPriceChange[] costPrice;
	private SupplyChainChange[] supplyChain;
	private EquipmentChange[] equipment;
	private UnitWeightChange[] unitWeight;
	private TrayWeightChange[] trayWeight;
	private List<String> buyerNames;
	private List<String> scpNames;
	private String supplierName;
	private String multistage;
	private String deliveryMethod;


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

	public String getUnitDescription() {
		return unitDescription;
	}

	public void setUnitDescription(final String unitDescription) {
		this.unitDescription = unitDescription;
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

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(final String vendorName) {
		this.vendorName = vendorName;
	}

	public String getWorkflowId() {
		return workflowId;
	}

	public void setWorkflowId(final String workflowId) {
		this.workflowId = workflowId;
	}

	public String getWorkflowTitle() {
		return workflowTitle;
	}

	public void setWorkflowTitle(final String workflowTitle) {
		this.workflowTitle = workflowTitle;
	}

	public String getVendorNo() {
		return vendorNo;
	}

	public void setVendorNo(final String vendorNo) {
		this.vendorNo = vendorNo;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(final String currency) {
		this.currency = currency;
	}

	public CostPriceChange[] getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(final CostPriceChange[] costPrice) {
		this.costPrice = costPrice;
	}

	public SupplyChainChange[] getSupplyChain() {
		return supplyChain;
	}

	public void setSupplyChain(final SupplyChainChange[] supplyChain) {
		this.supplyChain = supplyChain;
	}

	public String getArticleNo() {
		return articleNo;
	}

	public void setArticleNo(final String articleNo) {
		this.articleNo = articleNo;
	}

	public List<String> getBuyerNames() {
		return buyerNames;
	}

	public void setBuyerNames(final List<String> buyerNames) {
		this.buyerNames = buyerNames;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(final String supplierName) {
		this.supplierName = supplierName;
	}

	public String getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(final String creationTime) {
		this.creationTime = creationTime;
	}

	public EquipmentChange[] getEquipment() {
		return equipment;
	}

	public void setEquipment(final EquipmentChange[] equipment) {
		this.equipment = equipment;
	}

	public UnitWeightChange[] getUnitWeight() {
		return unitWeight;
	}

	public void setUnitWeight(final UnitWeightChange[] unitWeight) {
		this.unitWeight = unitWeight;
	}

	public TrayWeightChange[] getTrayWeight() {
		return trayWeight;
	}

	public void setTrayWeight(final TrayWeightChange[] trayWeight) {
		this.trayWeight = trayWeight;
	}

	public String getRole() {
		return role;
	}

	public void setRole(final String role) {
		this.role = role;
	}
	
	

	public List<String> getScpNames() {
		return scpNames;
	}

	public void setScpNames(List<String> scpNames) {
		this.scpNames = scpNames;
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

	@Override
	public String toString() {
		return "Workflow{" +
				"categories='" + categories + '\'' +
				", articleNo='" + articleNo + '\'' +
				", articleDescription='" + articleDescription + '\'' +
				", unitDescription='" + unitDescription + '\'' +
				", upc='" + upc + '\'' +
				", multiSupply='" + multiSupply + '\'' +
				", vendorName='" + vendorName + '\'' +
				", ragStatus='" + ragStatus + '\'' +
				", vendorNo='" + vendorNo + '\'' +
				", currency='" + currency + '\'' +
				", workflowStatus='" + workflowStatus + '\'' +
				", requestor='" + requestor + '\'' +
				", creationDate='" + creationDate + '\'' +
				", creationTime='" + creationTime + '\'' +
				", workflowId='" + workflowId + '\'' +
				", workflowTitle='" + workflowTitle + '\'' +
				", reasonCode='" + reasonCode + '\'' +
				", role='" + role + '\'' +
				", costPrice=" + Arrays.toString(costPrice) +
				", supplyChain=" + Arrays.toString(supplyChain) +
				", equipment=" + Arrays.toString(equipment) +
				", unitWeight=" + Arrays.toString(unitWeight) +
				", trayWeight=" + Arrays.toString(trayWeight) +
				", buyerNames=" + buyerNames +
				", scpNames=" + scpNames +
				", supplierName='" + supplierName + '\'' +
				", multistage='" + multistage + '\'' +
				", deliveryMethod='" + deliveryMethod + '\'' +
				'}';
	}

	
}