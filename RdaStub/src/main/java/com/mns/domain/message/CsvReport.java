package com.mns.domain.message;

public class CsvReport {

	public String upc;
	public String description;
	public String vendorCode;
	public String category;
	public String dualSupply;
	public String siteName;
	public String ragStatus;
	public String reason;
	public String creationDate;
	public String vendorUserName;
	public String uptCurrent;
	public String uptNew;
	// UptNewFromDate rename from supplychainFromDate;
	public String uptNewFromDate;
	// UptNewToDate rename from supplychainToDate;
	public String uptNewToDate;
	public String backendStatus;
	

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public String getBackendStatus() {
		return backendStatus;
	}

	public void setBackendStatus(final String backendStatus) {
		this.backendStatus = backendStatus;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(final String category) {
		this.category = category;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(final String creationDate) {
		this.creationDate = creationDate;
	}

	public String getUptCurrent() {
		return uptCurrent;
	}

	public void setUptCurrent(final String uptCurrent) {
		this.uptCurrent = uptCurrent;
	}

	public String getDualSupply() {
		return dualSupply;
	}

	public void setDualSupply(final String dualSupply) {
		this.dualSupply = dualSupply;
	}

	public String getUptNew() {
		return uptNew;
	}

	public void setUptNew(final String uptNew) {
		this.uptNew = uptNew;
	}

	public String getRagStatus() {
		return ragStatus;
	}

	public void setRagStatus(final String ragStatus) {
		this.ragStatus = ragStatus;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(final String reason) {
		this.reason = reason;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(final String siteName) {
		this.siteName = siteName;
	}

	public String getVendorUserName() {
		return vendorUserName;
	}

	public void setVendorUserName(final String vendorUserName) {
		this.vendorUserName = vendorUserName;
	}

	public String getUptNewFromDate() {
		return uptNewFromDate;
	}

	public void setUptNewFromDate(final String uptNewFromDate) {
		this.uptNewFromDate = uptNewFromDate;
	}

	public String getUptNewToDate() {
		return uptNewToDate;
	}

	public void setUptNewToDate(final String uptNewToDate) {
		this.uptNewToDate = uptNewToDate;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(final String upc) {
		this.upc = upc;
	}

	public String getVendorCode() {
		return vendorCode;
	}

	public void setVendorCode(final String vendorCode) {
		this.vendorCode = vendorCode;
	}

	/*public String getBuyerWorkflowStatus() {
		return buyerWorkflowStatus;
	}

	public void setBuyerWorkflowStatus(String buyerWorkflowStatus) {
		this.buyerWorkflowStatus = buyerWorkflowStatus;
	}

	public String getBuyerActionDate() {
		return buyerActionDate;
	}

	public void setBuyerActionDate(String buyerActionDate) {
		this.buyerActionDate = buyerActionDate;
	}*/

	@Override
	public String toString() {
		return "CsvReport{" +
				"upc='" + upc + '\'' +
				", description='" + description + '\'' +
				", vendorCode='" + vendorCode + '\'' +
				", category='" + category + '\'' +
				", dualSupply='" + dualSupply + '\'' +
				", siteName='" + siteName + '\'' +
				", ragStatus='" + ragStatus + '\'' +
				", reason='" + reason + '\'' +
				", creationDate='" + creationDate + '\'' +
				", vendorUserName='" + vendorUserName + '\'' +
				", uptCurrent='" + uptCurrent + '\'' +
				", uptNew='" + uptNew + '\'' +
				", uptNewFromDate='" + uptNewFromDate + '\'' +
				", uptNewToDate='" + uptNewToDate + '\'' +
				", backendStatus='" + backendStatus + '\'' +
				'}';
	}

	}
