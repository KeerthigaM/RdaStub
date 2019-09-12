package com.mns.domain;

public class UnitWeightSubmit {

	private String upt;

	private String orderUnit;

	private String fromDate;

	private String toDate;

	private String currentUnitNetWeight;

	private String newUnitNetWeight;

	private String currentPackNetContent;

	private String newPackNetContent;

	//private String netWeightOld;

	//private String netWeightNew;
	//private String packNetContentOld;

	//private String packNetContentNew;

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

	public String getToDate() {
		return toDate;
	}

	public void setToDate(final String toDate) {
		this.toDate = toDate;
	}

	public String getCurrentUnitNetWeight() {
		return currentUnitNetWeight;
	}

	public void setCurrentUnitNetWeight(final String currentUnitNetWeight) {
		this.currentUnitNetWeight = currentUnitNetWeight;
	}

	public String getNewUnitNetWeight() {
		return newUnitNetWeight;
	}

	public void setNewUnitNetWeight(final String newUnitNetWeight) {
		this.newUnitNetWeight = newUnitNetWeight;
	}

	public String getCurrentPackNetContent() {
		return currentPackNetContent;
	}

	public void setCurrentPackNetContent(final String currentPackNetContent) {
		this.currentPackNetContent = currentPackNetContent;
	}

	public String getNewPackNetContent() {
		return newPackNetContent;
	}

	public void setNewPackNetContent(final String newPackNetContent) {
		this.newPackNetContent = newPackNetContent;
	}

	@Override
	public String toString() {
		return "UnitWeightSubmit{" +
				"upt='" + upt + '\'' +
				", orderUnit='" + orderUnit + '\'' +
				", fromDate='" + fromDate + '\'' +
				", toDate='" + toDate + '\'' +
				", currentUnitNetWeight='" + currentUnitNetWeight + '\'' +
				", newUnitNetWeight='" + newUnitNetWeight + '\'' +
				", currentPackNetContent='" + currentPackNetContent + '\'' +
				", newPackNetContent='" + newPackNetContent + '\'' +
				'}';
	}
}
