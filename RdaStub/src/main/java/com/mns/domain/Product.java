package com.mns.domain;

public class Product {

	private String vendorNo;
	private String vendorName;
	private String upc;
	private String articleNo;
	private String articleDescription;
	private String unitDescription;
	private String deptName;
	private String deliveryMethod;
	private String categories;
	private String message;
	private String currency;

	public String getVendorNo() {
		return vendorNo;
	}

	public void setVendorNo(final String vendorNo) {
		this.vendorNo = vendorNo;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setName(final String vendorName) {
		this.vendorName = vendorName;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(final String upc) {
		this.upc = upc;
	}

	public String getArticleNo() {
		return articleNo;
	}

	public void setArticleNo(final String articleNo) {
		this.articleNo = articleNo;
	}

	public String getArticleDescription() {
		return articleDescription;
	}

	public void setArticleDescription(final String articleDescription) {
		this.articleDescription = articleDescription;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(final String deptName) {
		this.deptName = deptName;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(final String categories) {
		this.categories = categories;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(final String message) {
		this.message = message;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(final String currency) {
		this.currency = currency;
	}

	public String getUnitDescription() {
		return unitDescription;
	}

	public void setUnitDescription(final String unitDescription) {
		this.unitDescription = unitDescription;
	}

	public String getDeliveryMethod() {
		return deliveryMethod;
	}

	public void setDeliveryMethod(final String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}

	@Override
	public String toString() {
		return "Product{" +
				"vendorNo='" + vendorNo + '\'' +
				", vendorName='" + vendorName + '\'' +
				", upc='" + upc + '\'' +
				", articleNo='" + articleNo + '\'' +
				", articleDescription='" + articleDescription + '\'' +
				", unitDescription='" + unitDescription + '\'' +
				", deptName='" + deptName + '\'' +
				", deliveryMethod='" + deliveryMethod + '\'' +
				", categories='" + categories + '\'' +
				", message='" + message + '\'' +
				", currency='" + currency + '\'' +
				'}';
	}
}
