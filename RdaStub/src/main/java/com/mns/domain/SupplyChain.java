package com.mns.domain;

public class SupplyChain {

	private String vendorNo;
	private String articleNo;
	private String siteGroup;
	private String classType;
	private String validFrom;
	private String upc;
	private String siteCode;
	private String siteName;
	private String fromDate;
	private String toDate;
	private String orderUnit;
	private String siteCategory;
	private boolean singleDepot;

	public String getVendorNo() {
		return vendorNo;
	}

	public void setVendorNo(final String vendorNo) {
		this.vendorNo = vendorNo;
	}

	public String getArticleNo() {
		return articleNo;
	}

	public void setArticleNo(final String articleNo) {
		this.articleNo = articleNo;
	}

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

	public String getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(final String validFrom) {
		this.validFrom = validFrom;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(final String upc) {
		this.upc = upc;
	}

	public String getSiteCode() {
		return siteCode;
	}

	public void setSiteCode(final String siteCode) {
		this.siteCode = siteCode;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(final String siteName) {
		this.siteName = siteName;
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

	public String getOrderUnit() {
		return orderUnit;
	}

	public void setOrderUnit(final String orderUnit) {
		this.orderUnit = orderUnit;
	}

	public String getSiteCategory() {
		return siteCategory;
	}

	public void setSiteCategory(final String siteCategory) {
		this.siteCategory = siteCategory;
	}

	public boolean isSingleDepot() {
		return singleDepot;
	}

	public void setSingleDepot(final boolean singleDepot) {
		this.singleDepot = singleDepot;
	}

	@Override
	public String toString() {
		return "SupplyChain{" +
				"vendorNo='" + vendorNo + '\'' +
				", articleNo='" + articleNo + '\'' +
				", siteGroup='" + siteGroup + '\'' +
				", classType='" + classType + '\'' +
				", validFrom='" + validFrom + '\'' +
				", upc='" + upc + '\'' +
				", siteCode='" + siteCode + '\'' +
				", siteName='" + siteName + '\'' +
				", fromDate='" + fromDate + '\'' +
				", toDate='" + toDate + '\'' +
				", orderUnit='" + orderUnit + '\'' +
				", siteCategory='" + siteCategory + '\'' +
				", singleDepot=" + singleDepot +
				'}';
	}
}
