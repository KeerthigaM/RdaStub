package com.mns.domain.message;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder(value = { "upc","description","vendorCode", "category", "dualSupply", "siteName", "ragStatus", "reason", "creationDate", "vendorUserName", "uptCurrent", "uptNew", "uptNewFromDate", "uptNewToDate", "backendStatus", "scpName", "scpActionDate", "scpWorkflowStatus"})
public class SCPCsvReport extends CsvReport {

	public String scpName;
	public String scpActionDate="";
	public String scpWorkflowStatus="";
	public String getScpName() {
		return scpName;
	}
	public void setScpName(String scpName) {
		this.scpName = scpName;
	}
	public String getScpActionDate() {
		return scpActionDate;
	}
	public void setScpActionDate(String scpActionDate) {
		this.scpActionDate = scpActionDate;
	}
	public String getScpWorkflowStatus() {
		return scpWorkflowStatus;
	}
	public void setScpWorkflowStatus(String scpWorkflowStatus) {
		this.scpWorkflowStatus = scpWorkflowStatus;
	}
	
	@Override
		public String toString() {
			return "SCPCsvReport{" +
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
		             ", scpName='" + scpName + '\'' +
		             ", scpActionDate='" + scpActionDate + '\'' +
		             ", scpWorkflowStatus='" + scpWorkflowStatus + '\'' +
		             '}';
	}
	
}
