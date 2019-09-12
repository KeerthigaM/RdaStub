package com.mns.domain;

/**
 * This object is for the pending workflow that has unit weight changes.
 */
public class UnitWeightChange {

	private String upt;
	private String orderUnit;
	private String fromDate;
	private String endDate;
	private String currentUnitNetWeight;
	private String currentPackNetContent;
	private String newUnitNetWeight;
	private String newPackNetContent;

	public String getUpt() {
		return upt;
	}

	public void setUpt(final String upt) {
		this.upt = upt;
	}

	public String getOrderUnit() {
		return orderUnit;
	}

	public void setOrderUnit(final String orderUnit) {
		this.orderUnit = orderUnit;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(final String fromDate) {
		this.fromDate = fromDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getCurrentUnitNetWeight() {
		return currentUnitNetWeight;
	}

	public void setCurrentUnitNetWeight(final String currentUnitNetWeight) {
		this.currentUnitNetWeight = currentUnitNetWeight;
	}

	public String getCurrentPackNetContent() {
		return currentPackNetContent;
	}

	public void setCurrentPackNetContent(final String currentPackNetContent) {
		this.currentPackNetContent = currentPackNetContent;
	}

	public String getNewUnitNetWeight() {
		return newUnitNetWeight;
	}

	public void setNewUnitNetWeight(final String newUnitNetWeight) {
		this.newUnitNetWeight = newUnitNetWeight;
	}

	public String getNewPackNetContent() {
		return newPackNetContent;
	}

	public void setNewPackNetContent(final String newPackNetContent) {
		this.newPackNetContent = newPackNetContent;
	}

	@Override
	public String toString() {
		return "UnitWeightChange{" +
				"upt='" + upt + '\'' +
				", orderUnit='" + orderUnit + '\'' +
				", fromDate='" + fromDate + '\'' +
				", endDate='" + endDate + '\'' +
				", currentUnitNetWeight='" + currentUnitNetWeight + '\'' +
				", currentPackNetContent='" + currentPackNetContent + '\'' +
				", newUnitNetWeight='" + newUnitNetWeight + '\'' +
				", newPackNetContent='" + newPackNetContent + '\'' +
				'}';
	}
}
