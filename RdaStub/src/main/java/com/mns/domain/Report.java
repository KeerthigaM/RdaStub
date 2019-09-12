package com.mns.domain;

public class Report {

	private String upc;
	private String articleNo;
	private String articleDescription;
	private String siteCode;
	private String siteName;
	private String siteGroup;
	private String categories;
	private String multiSupply;
	private String reasonCode;
	private String newUpt;
	private String currentUpt;
	private String supplychainFromDate;
	private String supplychainToDate;
	private String newCostPrice;
	private String currentCostPrice;
	private String priceCurrency;
	private String costPriceUpt;
	private String costPriceFromDate;
	private String costPriceToDate;
	private String vendorNo;
	private String ragStatus;
	private String workflowStatus;
	private String workItemId;
	private String workItemTitle;
	private String backendStatus;
	private String approverId;
	private String rejectionReasonCode;
	private String creationDate;
	private String creationTime;
	private String requestor;
	private String actionDate;
	private String actionTime;
	private String supplierName;
	private String buyerName;
	private String unitNetWeightOld;
	private String packNetContentOld;
	private String unitNetWeightNew;
	private String packNetContentNew;
	private String validFromUnitWeight;
	private String validToUnitWeight;
	private String uptTrayWeight;
	private String trayNetWeightOld;
	private String trayGrossWeightOld;
	private String trayNetWeightNew;
	private String trayGrossWeightNew;
	private String validFromTrayWeight;
	private String validToTrayWeight;
	private String orderUnitEquipment;
	private String uptEquipment;
	private String validFromEquipment;
	private String validToEquipment;
	private String currentEquipmentType;
	private String currentEquipmentSetting;
	private String newEquipmentType;
	private String newEquipmentSetting;
	private String scpName;
	
	//Spring 28 Reports
	private String role;
	private String multistage;
	private String scpWorkflowStatus="";
	private String scpActionDate="";
	private String scpActionTime="";



	public String getUpc() {
		return upc;
	}

	public void setUpc(final String upc) {
		this.upc = upc;
	}

	public String getArticleDescription() {
		return articleDescription;
	}

	public void setArticleDescription(final String articleDescription) {
		this.articleDescription = articleDescription;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(final String siteName) {
		this.siteName = siteName;
	}

	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(final String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getNewCostPrice() {
		return newCostPrice;
	}

	public void setNewCostPrice(final String newCostPrice) {
		this.newCostPrice = newCostPrice;
	}

	public String getCurrentCostPrice() {
		return currentCostPrice;
	}

	public void setCurrentCostPrice(final String currentCostPrice) {
		this.currentCostPrice = currentCostPrice;
	}

	public String getPriceCurrency() {
		return priceCurrency;
	}

	public void setPriceCurrency(final String priceCurrency) {
		this.priceCurrency = priceCurrency;
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

	public String getWorkItemId() {
		return workItemId;
	}

	public void setWorkItemId(final String workItemId) {
		this.workItemId = workItemId;
	}

	public String getWorkItemTitle() {
		return workItemTitle;
	}

	public void setWorkItemTitle(final String workItemTitle) {
		this.workItemTitle = workItemTitle;
	}

	public String getApproverId() {
		return approverId;
	}

	public void setApproverId(final String approverId) {
		this.approverId = approverId;
	}

	public String getRejectionReasonCode() {
		return rejectionReasonCode;
	}

	public void setRejectionReasonCode(final String rejectionReasonCode) {
		this.rejectionReasonCode = rejectionReasonCode;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(final String creationDate) {
		this.creationDate = creationDate;
	}

	public String getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(final String creationTime) {
		this.creationTime = creationTime;
	}

	public String getActionDate() {
		return actionDate;
	}

	public void setActionDate(final String actionDate) {
		this.actionDate = actionDate;
	}

	public String getActionTime() {
		return actionTime;
	}

	public void setActionTime(final String actionTime) {
		this.actionTime = actionTime;
	}

	public String getSupplychainFromDate() {
		return supplychainFromDate;
	}

	public void setSupplychainFromDate(final String supplychainFromDate) {
		this.supplychainFromDate = supplychainFromDate;
	}

	public String getSupplychainToDate() {
		return supplychainToDate;
	}

	public void setSupplychainToDate(final String supplychainToDate) {
		this.supplychainToDate = supplychainToDate;
	}

	public String getCostPriceFromDate() {
		return costPriceFromDate;
	}

	public void setCostPriceFromDate(final String costPriceFromDate) {
		this.costPriceFromDate = costPriceFromDate;
	}

	public String getCostPriceToDate() {
		return costPriceToDate;
	}

	public void setCostPriceToDate(final String costPriceToDate) {
		this.costPriceToDate = costPriceToDate;
	}

	public String getSiteCode() {
		return siteCode;
	}

	public void setSiteCode(final String siteCode) {
		this.siteCode = siteCode;
	}

	public String getSiteGroup() {
		return siteGroup;
	}

	public void setSiteGroup(final String siteGroup) {
		this.siteGroup = siteGroup;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(final String categories) {
		this.categories = categories;
	}

	public String getCurrentUpt() {
		return currentUpt;
	}

	public void setCurrentUpt(final String currentUpt) {
		this.currentUpt = currentUpt;
	}

	public String getNewUpt() {
		return newUpt;
	}

	public void setNewUpt(final String newUpt) {
		this.newUpt = newUpt;
	}

	public String getVendorNo() {
		return vendorNo;
	}

	public void setVendorNo(final String vendorNo) {
		this.vendorNo = vendorNo;
	}

	public String getRequestor() {
		return requestor;
	}

	public void setRequestor(final String requestor) {
		this.requestor = requestor;
	}

	public String getArticleNo() {
		return articleNo;
	}

	public void setArticleNo(final String articleNo) {
		this.articleNo = articleNo;
	}

	public String getMultiSupply() {
		return multiSupply;
	}

	public void setMultiSupply(final String multiSupply) {
		this.multiSupply = multiSupply;
	}

	public String getBackendStatus() {
		return backendStatus;
	}

	public void setBackendStatus(final String backendStatus) {
		this.backendStatus = backendStatus;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(final String supplierUser) {
		this.supplierName = supplierUser;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(final String buyerName) {
		this.buyerName = buyerName;
	}

	public String getCostPriceUpt() {
		return costPriceUpt;
	}

	public void setCostPriceUpt(final String costPriceUpt) {
		this.costPriceUpt = costPriceUpt;
	}

	public String getUnitNetWeightOld() {
		return unitNetWeightOld;
	}

	public void setUnitNetWeightOld(final String unitNetWeightOld) {
		this.unitNetWeightOld = unitNetWeightOld;
	}

	public String getPackNetContentOld() {
		return packNetContentOld;
	}

	public void setPackNetContentOld(final String packNetContentOld) {
		this.packNetContentOld = packNetContentOld;
	}

	public String getUnitNetWeightNew() {
		return unitNetWeightNew;
	}

	public void setUnitNetWeightNew(final String unitNetWeightNew) {
		this.unitNetWeightNew = unitNetWeightNew;
	}

	public String getPackNetContentNew() {
		return packNetContentNew;
	}

	public void setPackNetContentNew(final String packNetContentNew) {
		this.packNetContentNew = packNetContentNew;
	}

	public String getValidFromUnitWeight() {
		return validFromUnitWeight;
	}

	public void setValidFromUnitWeight(final String validFromUnitWeight) {
		this.validFromUnitWeight = validFromUnitWeight;
	}

	public String getValidToUnitWeight() {
		return validToUnitWeight;
	}

	public void setValidToUnitWeight(final String validToUnitWeight) {
		this.validToUnitWeight = validToUnitWeight;
	}

	public String getUptTrayWeight() {
		return uptTrayWeight;
	}

	public void setUptTrayWeight(final String uptTrayWeight) {
		this.uptTrayWeight = uptTrayWeight;
	}

	public String getTrayNetWeightOld() {
		return trayNetWeightOld;
	}

	public void setTrayNetWeightOld(final String trayNetWeightOld) {
		this.trayNetWeightOld = trayNetWeightOld;
	}

	public String getTrayGrossWeightOld() {
		return trayGrossWeightOld;
	}

	public void setTrayGrossWeightOld(final String trayGrossWeightOld) {
		this.trayGrossWeightOld = trayGrossWeightOld;
	}

	public String getTrayNetWeightNew() {
		return trayNetWeightNew;
	}

	public void setTrayNetWeightNew(final String trayNetWeightNew) {
		this.trayNetWeightNew = trayNetWeightNew;
	}

	public String getTrayGrossWeightNew() {
		return trayGrossWeightNew;
	}

	public void setTrayGrossWeightNew(final String trayGrossWeightNew) {
		this.trayGrossWeightNew = trayGrossWeightNew;
	}

	public String getValidFromTrayWeight() {
		return validFromTrayWeight;
	}

	public void setValidFromTrayWeight(final String validFromTrayWeight) {
		this.validFromTrayWeight = validFromTrayWeight;
	}

	public String getValidToTrayWeight() {
		return validToTrayWeight;
	}

	public void setValidToTrayWeight(final String validToTrayWeight) {
		this.validToTrayWeight = validToTrayWeight;
	}

	public String getOrderUnitEquipment() {
		return orderUnitEquipment;
	}

	public void setOrderUnitEquipment(final String orderUnitEquipment) {
		this.orderUnitEquipment = orderUnitEquipment;
	}

	public String getUptEquipment() {
		return uptEquipment;
	}

	public void setUptEquipment(final String uptEquipment) {
		this.uptEquipment = uptEquipment;
	}

	public String getValidFromEquipment() {
		return validFromEquipment;
	}

	public void setValidFromEquipment(final String validFromEquipment) {
		this.validFromEquipment = validFromEquipment;
	}

	public String getValidToEquipment() {
		return validToEquipment;
	}

	public void setValidToEquipment(final String validToEquipment) {
		this.validToEquipment = validToEquipment;
	}

	public String getCurrentEquipmentType() {
		return currentEquipmentType;
	}

	public void setCurrentEquipmentType(String currentEquipmentType) {
		this.currentEquipmentType = currentEquipmentType;
	}

	public String getCurrentEquipmentSetting() {
		return currentEquipmentSetting;
	}

	public void setCurrentEquipmentSetting(String currentEquipmentSetting) {
		this.currentEquipmentSetting = currentEquipmentSetting;
	}

	public String getNewEquipmentType() {
		return newEquipmentType;
	}

	public void setNewEquipmentType(String newEquipmentType) {
		this.newEquipmentType = newEquipmentType;
	}

	public String getNewEquipmentSetting() {
		return newEquipmentSetting;
	}

	public void setNewEquipmentSetting(String newEquipmentSetting) {
		this.newEquipmentSetting = newEquipmentSetting;
	}
	public String getRole() {
		return role;
	}

	public void setRole(final String role) {
		this.role = role;
	}

	public String getMultistage() {
		return multistage;
	}

	public void setMultistage(final String multistage) {
		this.multistage = multistage;
	}
	
	public String getScpWorkflowStatus() {
		return scpWorkflowStatus;
	}

	public void setScpWorkflowStatus(String scpWorkflowStatus) {
		this.scpWorkflowStatus = scpWorkflowStatus;
	}

	public String getScpActionDate() {
		return scpActionDate;
	}

	public void setScpActionDate(String scpActionDate) {
		this.scpActionDate = scpActionDate;
	}

	public String getScpActionTime() {
		return scpActionTime;
	}

	public void setScpActionTime(String scpActionTime) {
		this.scpActionTime = scpActionTime;
	}
	public String getScpName() {
		return scpName;
	}

	public void setScpName(String scpName) {
		this.scpName = scpName;
	}

	@Override
	public String toString() {
		return "Report{" +
				"upc='" + upc + '\'' +
				", articleNo='" + articleNo + '\'' +
				", articleDescription='" + articleDescription + '\'' +
				", siteCode='" + siteCode + '\'' +
				", siteName='" + siteName + '\'' +
				", siteGroup='" + siteGroup + '\'' +
				", categories='" + categories + '\'' +
				", multiSupply='" + multiSupply + '\'' +
				", reasonCode='" + reasonCode + '\'' +
				", newUpt='" + newUpt + '\'' +
				", currentUpt='" + currentUpt + '\'' +
				", supplychainFromDate='" + supplychainFromDate + '\'' +
				", supplychainToDate='" + supplychainToDate + '\'' +
				", newCostPrice='" + newCostPrice + '\'' +
				", currentCostPrice='" + currentCostPrice + '\'' +
				", priceCurrency='" + priceCurrency + '\'' +
				", costPriceUpt='" + costPriceUpt + '\'' +
				", costPriceFromDate='" + costPriceFromDate + '\'' +
				", costPriceToDate='" + costPriceToDate + '\'' +
				", vendorNo='" + vendorNo + '\'' +
				", ragStatus='" + ragStatus + '\'' +
				", workflowStatus='" + workflowStatus + '\'' +
				", workItemId='" + workItemId + '\'' +
				", workItemTitle='" + workItemTitle + '\'' +
				", backendStatus='" + backendStatus + '\'' +
				", approverId='" + approverId + '\'' +
				", rejectionReasonCode='" + rejectionReasonCode + '\'' +
				", creationDate='" + creationDate + '\'' +
				", creationTime='" + creationTime + '\'' +
				", requestor='" + requestor + '\'' +
				", actionDate='" + actionDate + '\'' +
				", actionTime='" + actionTime + '\'' +
				", supplierName='" + supplierName + '\'' +
				", buyerName='" + buyerName + '\'' +
				", unitNetWeightOld='" + unitNetWeightOld + '\'' +
				", packNetContentOld='" + packNetContentOld + '\'' +
				", unitNetWeightNew='" + unitNetWeightNew + '\'' +
				", packNetContentNew='" + packNetContentNew + '\'' +
				", validFromUnitWeight='" + validFromUnitWeight + '\'' +
				", validToUnitWeight='" + validToUnitWeight + '\'' +
				", uptTrayWeight='" + uptTrayWeight + '\'' +
				", trayNetWeightOld='" + trayNetWeightOld + '\'' +
				", trayGrossWeightOld='" + trayGrossWeightOld + '\'' +
				", trayNetWeightNew='" + trayNetWeightNew + '\'' +
				", trayGrossWeightNew='" + trayGrossWeightNew + '\'' +
				", validFromTrayWeight='" + validFromTrayWeight + '\'' +
				", validToTrayWeight='" + validToTrayWeight + '\'' +
				", orderUnitEquipment='" + orderUnitEquipment + '\'' +
				", uptEquipment='" + uptEquipment + '\'' +
				", validFromEquipment='" + validFromEquipment + '\'' +
				", validToEquipment='" + validToEquipment + '\'' +
				", currentEquipmentType='" + currentEquipmentType + '\'' +
				", currentEquipmentSetting='" + currentEquipmentSetting + '\'' +
				", role='" + role + '\'' +
				", multiStage='" + multistage + '\'' +
				", scpWorkFlowStatus='" + scpWorkflowStatus + '\'' +
				", scpActionDate='" + scpActionDate + '\'' +
				", scpActionTime='" + scpActionTime + '\'' +
				", newEquipmentType='" + newEquipmentType + '\'' +
				", newEquipmentSetting='" + newEquipmentSetting + '\'' +
				", scpName='" + scpName + '\'' +
				'}';
	}

	

	}
