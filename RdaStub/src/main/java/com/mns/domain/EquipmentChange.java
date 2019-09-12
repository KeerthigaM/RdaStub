package com.mns.domain;

/**
 * This object is what exists when receiving a pending workflow with equipment change.
 */
public class EquipmentChange {

	private String upt;

	private String orderUnit;

	private String fromDate;

	private String endDate;
	
	private String newEquipmentType;

	private String newEquipmentSetting;

	private String currentEquipmentType;

	private String currentEquipmentSetting;

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

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(final String endDate) {
		this.endDate = endDate;
	}

	public String getNewEquipmentType() {
		return newEquipmentType;
	}

	public void setNewEquipmentType(final String newEquipmentType) {
		this.newEquipmentType = newEquipmentType;
	}

	public String getNewEquipmentSetting() {
		return newEquipmentSetting;
	}

	public void setNewEquipmentSetting(final String newEquipmentSetting) {
		this.newEquipmentSetting = newEquipmentSetting;
	}

	public String getCurrentEquipmentType() {
		return currentEquipmentType;
	}

	public void setCurrentEquipmentType(final String currentEquipmentType) {
		this.currentEquipmentType = currentEquipmentType;
	}

	public String getCurrentEquipmentSetting() {
		return currentEquipmentSetting;
	}

	public void setCurrentEquipmentSetting(final String currentEquipmentSetting) {
		this.currentEquipmentSetting = currentEquipmentSetting;
	}

	@Override
	public String toString() {
		return "EquipmentChange{" +
				"upt='" + upt + '\'' +
				", orderUnit='" + orderUnit + '\'' +
				", fromDate='" + fromDate + '\'' +
				", endDate='" + endDate + '\'' +
				", newEquipmentType='" + newEquipmentType + '\'' +
				", newEquipmentSetting='" + newEquipmentSetting + '\'' +
				", currentEquipmentType='" + currentEquipmentType + '\'' +
				", currentEquipmentSetting='" + currentEquipmentSetting + '\'' +
				'}';
	}
}