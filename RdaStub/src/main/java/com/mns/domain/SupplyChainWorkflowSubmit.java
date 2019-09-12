package com.mns.domain;

public class SupplyChainWorkflowSubmit {

	private String siteGroup;
	private String classType;
	private String siteCode;
	private String fromDate;
	private String toDate;
	private String currentOrderUnit;
	private String currentUpt;
	private String newOrderUnit;
	private String newUpt;
	private String siteCategory;

	public String getSiteGroup() {
		return siteGroup;
	}

	public void setSiteGroup(final String siteGroup) {
		this.siteGroup = siteGroup;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(final String classType) {
		this.classType = classType;
	}

	public String getSiteCode() {
		return siteCode;
	}

	public void setSiteCode(final String siteCode) {
		this.siteCode = siteCode;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(final String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(final String toDate) {
		this.toDate = toDate;
	}

	public String getCurrentOrderUnit() {
		return currentOrderUnit;
	}

	public void setCurrentOrderUnit(final String currentOrderUnit) {
		this.currentOrderUnit = currentOrderUnit;
	}

	public String getCurrentUpt() {
		return currentUpt;
	}

	public void setCurrentUpt(final String currentUpt) {
		this.currentUpt = currentUpt;
	}

	public String getNewOrderUnit() {
		return newOrderUnit;
	}

	public void setNewOrderUnit(final String newOrderUnit) {
		this.newOrderUnit = newOrderUnit;
	}

	public String getNewUpt() {
		return newUpt;
	}

	public void setNewUpt(final String newUpt) {
		this.newUpt = newUpt;
	}

	public String getSiteCategory() {
		return siteCategory;
	}

	public void setSiteCategory(final String siteCategory) {
		this.siteCategory = siteCategory;
	}

	@Override
	public String toString() {
		return "SupplyChainWorkflowSubmit{" +
				"siteGroup='" + siteGroup + '\'' +
				", classType='" + classType + '\'' +
				", siteCode='" + siteCode + '\'' +
				", fromDate='" + fromDate + '\'' +
				", toDate='" + toDate + '\'' +
				", currentOrderUnit='" + currentOrderUnit + '\'' +
				", currentUpt='" + currentUpt + '\'' +
				", newOrderUnit='" + newOrderUnit + '\'' +
				", newUpt='" + newUpt + '\'' +
				", siteCategory='" + siteCategory + '\'' +
				'}';
	}
}
