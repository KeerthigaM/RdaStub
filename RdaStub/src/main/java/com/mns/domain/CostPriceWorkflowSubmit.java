package com.mns.domain;

public class CostPriceWorkflowSubmit {

	private String fromDate;
	private String toDate;
	private String costPrice;
	private String upt;
	private String orderUnit;
	private String priceUnit;

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(final String fromDate) {
		this.fromDate = fromDate;
	}

	public String getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(final String costPrice) {
		this.costPrice = costPrice;
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

	public String getPriceUnit() {
		return priceUnit;
	}

	public void setPriceUnit(final String priceUnit) {
		this.priceUnit = priceUnit;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(final String toDate) {
		this.toDate = toDate;
	}

	@Override
	public String toString() {
		return "CostPriceWorkflowSubmit{" +
				"fromDate='" + fromDate + '\'' +
				", toDate='" + toDate + '\'' +
				", costPrice='" + costPrice + '\'' +
				", upt='" + upt + '\'' +
				", orderUnit='" + orderUnit + '\'' +
				", priceUnit='" + priceUnit + '\'' +
				'}';
	}
}
