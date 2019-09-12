package com.mns.domain;

/**
 * The tray weight change object for pending workflow.
 */
public class TrayWeightChange {

	private String fromDate;
	private String endDate;
	private String upt;
	private String orderUnit;
	private String currentTrayNetWeight;
	private String currentTrayGrossWeight;
	private String newTrayNetWeight;
	private String newTrayGrossWeight;

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

	public String getCurrentTrayNetWeight() {
		return currentTrayNetWeight;
	}

	public void setCurrentTrayNetWeight(final String currentTrayNetWeight) {
		this.currentTrayNetWeight = currentTrayNetWeight;
	}

	public String getCurrentTrayGrossWeight() {
		return currentTrayGrossWeight;
	}

	public void setCurrentTrayGrossWeight(final String currentTrayGrossWeight) {
		this.currentTrayGrossWeight = currentTrayGrossWeight;
	}

	public String getNewTrayNetWeight() {
		return newTrayNetWeight;
	}

	public void setNewTrayNetWeight(final String newTrayNetWeight) {
		this.newTrayNetWeight = newTrayNetWeight;
	}

	public String getNewTrayGrossWeight() {
		return newTrayGrossWeight;
	}

	public void setNewTrayGrossWeight(final String newTrayGrossWeight) {
		this.newTrayGrossWeight = newTrayGrossWeight;
	}

	@Override
	public String toString() {
		return "TrayWeightChange{" +
				"fromDate='" + fromDate + '\'' +
				", endDate='" + endDate + '\'' +
				", upt='" + upt + '\'' +
				", orderUnit='" + orderUnit + '\'' +
				", currentTrayNetWeight='" + currentTrayNetWeight + '\'' +
				", currentTrayGrossWeight='" + currentTrayGrossWeight + '\'' +
				", newTrayNetWeight='" + newTrayNetWeight + '\'' +
				", newTrayGrossWeight='" + newTrayGrossWeight + '\'' +
				'}';
	}
}
