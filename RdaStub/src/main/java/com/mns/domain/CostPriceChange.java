package com.mns.domain;

public class CostPriceChange {

	private String fromDate;
	private String endDate;
	private String newCostPrice;
	private String currentCostPrice;
	private String upt;
	private String orderUnit;

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(final String fromDate) {
		this.fromDate = fromDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(final String endDate) {
		this.endDate = endDate;
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

	@Override
	public String toString() {
		return "CostPriceChange{" +
				"fromDate='" + fromDate + '\'' +
				", endDate='" + endDate + '\'' +
				", newCostPrice='" + newCostPrice + '\'' +
				", currentCostPrice='" + currentCostPrice + '\'' +
				", upt='" + upt + '\'' +
				", orderUnit='" + orderUnit + '\'' +
				'}';
	}
}
