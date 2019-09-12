package com.mns.domain;

public class EquipmentDetails {

	private String vendorNo;
	private String articleNo;
	private String upc;
	private String orderUnit;
	private String upt;
	private String fromDate;
	private String toDate;
	private String equipmentType;
	private String equipmentSetting;
	private String status;

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

	public String getEquipmentType() {
		return equipmentType;
	}

	public void setEquipmentType(final String equipmentType) {
		this.equipmentType = equipmentType;
	}

	public String getEquipmentSetting() {
		return equipmentSetting;
	}

	public void setEquipmentSetting(final String equipmentSetting) {
		this.equipmentSetting = equipmentSetting;
	}

	public String getUpt() {
		return upt;
	}

	public void setUpt(final String upt) {
		this.upt = upt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(final String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "EquipmentDetails{" +
				"vendorNo='" + vendorNo + '\'' +
				", articleNo='" + articleNo + '\'' +
				", upc='" + upc + '\'' +
				", orderUnit='" + orderUnit + '\'' +
				", upt='" + upt + '\'' +
				", fromDate='" + fromDate + '\'' +
				", toDate='" + toDate + '\'' +
				", equipmentType='" + equipmentType + '\'' +
				", equipmentSetting='" + equipmentSetting + '\'' +
				", status='" + status + '\'' +
				'}';
	}
}
