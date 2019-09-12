package com.mns.domain;

public class TrayWeightSubmit {

	private String upt;

	private String orderUnit;

	private String fromDate;

	private String toDate;

	private String currentTrayNetWeight;

	private String newTrayNetWeight;

	private String currentTrayGrossWeight;

	private String newTrayGrossWeight;

	//private String netWeightOld;

	//private String netWeightNew;

	//private String grossWeightOld;

	//private String grossWeightNew;

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

	public String getCurrentTrayNetWeight() {
		return currentTrayNetWeight;
	}

	public void setCurrentTrayNetWeight(final String currentTrayNetWeight) {
		this.currentTrayNetWeight = currentTrayNetWeight;
	}

	public String getNewTrayNetWeight() {
		return newTrayNetWeight;
	}

	public void setNewTrayNetWeight(final String newTrayNetWeight) {
		this.newTrayNetWeight = newTrayNetWeight;
	}

	public String getCurrentTrayGrossWeight() {
		return currentTrayGrossWeight;
	}

	public void setCurrentTrayGrossWeight(final String currentTrayGrossWeight) {
		this.currentTrayGrossWeight = currentTrayGrossWeight;
	}

	public String getNewTrayGrossWeight() {
		return newTrayGrossWeight;
	}

	public void setNewTrayGrossWeight(final String newTrayGrossWeight) {
		this.newTrayGrossWeight = newTrayGrossWeight;
	}

	@Override
	public String toString() {
		return "TrayWeightSubmit{" +
				"upt='" + upt + '\'' +
				", orderUnit='" + orderUnit + '\'' +
				", fromDate='" + fromDate + '\'' +
				", toDate='" + toDate + '\'' +
				", currentTrayNetWeight='" + currentTrayNetWeight + '\'' +
				", newTrayNetWeight='" + newTrayNetWeight + '\'' +
				", currentTrayGrossWeight='" + currentTrayGrossWeight + '\'' +
				", newTrayGrossWeight='" + newTrayGrossWeight + '\'' +
				'}';
	}
}
