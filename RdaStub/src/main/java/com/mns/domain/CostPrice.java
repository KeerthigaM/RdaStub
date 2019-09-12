package com.mns.domain;

public class CostPrice {

	private String accountNumber;
	private String articleNo;
	private String orderUnit;
	private String date;
	private String upc;
	private String fromDate;
	private String toDate;
	private String costPrice;
	private String priceCurrency;
	private String priceUnit;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(final String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getArticleNo() {
		return articleNo;
	}

	public void setArticleNo(final String articleNo) {
		this.articleNo = articleNo;
	}

	public String getOrderUnit() {
		return orderUnit;
	}

	public void setOrderUnit(final String orderUnit) {
		this.orderUnit = orderUnit;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(final String upc) {
		this.upc = upc;
	}

	public String getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(final String costPrice) {
		this.costPrice = costPrice;
	}

	public String getPriceCurrency() {
		return priceCurrency;
	}

	public void setPriceCurrency(final String priceCurrency) {
		this.priceCurrency = priceCurrency;
	}

	public String getPriceUnit() {
		return priceUnit;
	}

	public void setPriceUnit(final String priceUnit) {
		this.priceUnit = priceUnit;
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

	public String getDate() {
		return date;
	}

	public void setDate(final String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "CostPrice{" +
				"accountNumber='" + accountNumber + '\'' +
				", articleNo='" + articleNo + '\'' +
				", orderUnit='" + orderUnit + '\'' +
				", date='" + date + '\'' +
				", upc='" + upc + '\'' +
				", fromDate='" + fromDate + '\'' +
				", toDate='" + toDate + '\'' +
				", costPrice='" + costPrice + '\'' +
				", priceCurrency='" + priceCurrency + '\'' +
				", priceUnit='" + priceUnit + '\'' +
				'}';
	}
}
