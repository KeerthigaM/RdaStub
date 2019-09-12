package com.mns.domain;

/**
 * This class holds the information for each UPT that is fetched from SAP.
 */
public class Upt {

	private String vendorNo;
	private String articleNo;
	private String upc;
	private String validFrom;
	private String orderUnit;
	private String upt;
	private String message;
	private String baseUnit;
	private String productUnitType;
	private String fromDate;
	private String toDate;
	private String costPrice;
	private String currency;
	private String priceUnit;
	private String unitNetWeight;
	private String packNetContent;
	private String trayNetContent;
	private String trayGrossWeight;

	public String getArticleNo() {
		return articleNo;
	}

	public void setArticleNo(final String articleNo) {
		this.articleNo = articleNo;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(final String upc) {
		this.upc = upc;
	}

	public String getOrderUnit() {
		return orderUnit;
	}

	public void setOrderUnit(final String orderUnit) {
		this.orderUnit = orderUnit;
	}

	public String getUpt() {
		return upt;
	}

	public void setUpt(final String upt) {
		this.upt = upt;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(final String message) {
		this.message = message;
	}

	public String getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(final String validFrom) {
		this.validFrom = validFrom;
	}

	public String getBaseUnit() {
		return baseUnit;
	}

	public void setBaseUnit(final String baseUnit) {
		this.baseUnit = baseUnit;
	}

	public String getProductUnitType() {
		return productUnitType;
	}

	public void setProductUnitType(final String productUnitType) {
		this.productUnitType = productUnitType;
	}

	public String getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(final String costPrice) {
		this.costPrice = costPrice;
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

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(final String currency) {
		this.currency = currency;
	}

	public String getVendorNo() {
		return vendorNo;
	}

	public void setVendorNo(final String vendorNo) {
		this.vendorNo = vendorNo;
	}

	public String getUnitNetWeight() {
		return unitNetWeight;
	}

	public void setUnitNetWeight(final String unitNetWeight) {
		this.unitNetWeight = unitNetWeight;
	}

	public String getPackNetContent() {
		return packNetContent;
	}

	public void setPackNetContent(final String packNetContent) {
		this.packNetContent = packNetContent;
	}

	public String getTrayNetContent() {
		return trayNetContent;
	}

	public void setTrayNetContent(final String trayNetContent) {
		this.trayNetContent = trayNetContent;
	}

	public String getTrayGrossWeight() {
		return trayGrossWeight;
	}

	public void setTrayGrossWeight(final String trayGrossWeight) {
		this.trayGrossWeight = trayGrossWeight;
	}

	@Override
	public String toString() {
		return "Upt{" +
				"vendorNo='" + vendorNo + '\'' +
				", articleNo='" + articleNo + '\'' +
				", upc='" + upc + '\'' +
				", validFrom='" + validFrom + '\'' +
				", orderUnit='" + orderUnit + '\'' +
				", upt='" + upt + '\'' +
				", message='" + message + '\'' +
				", baseUnit='" + baseUnit + '\'' +
				", productUnitType='" + productUnitType + '\'' +
				", fromDate='" + fromDate + '\'' +
				", toDate='" + toDate + '\'' +
				", costPrice='" + costPrice + '\'' +
				", currency='" + currency + '\'' +
				", priceUnit='" + priceUnit + '\'' +
				", unitNetWeight='" + unitNetWeight + '\'' +
				", packNetContent='" + packNetContent + '\'' +
				", trayNetContent='" + trayNetContent + '\'' +
				", trayGrossWeight='" + trayGrossWeight + '\'' +
				'}';
	}
}
