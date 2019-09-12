package com.mns.domain;

public class EquipmentWorkflowSubmit {

	private String orderUnit;

	private String upt;

	private String fromDate;

	private String toDate;

	private String currentEquipmentType;
	public String getCurrentEquipmentType() {
		return currentEquipmentType;
	}

	public void setCurrentEquipmentType(String currentEquipmentType) {
		this.currentEquipmentType = currentEquipmentType;
	}

	public String getCurrentEquipmentSetting() {
		return currentEquipmentSetting;
	}

	public void setCurrentEquipmentSetting(String currentEquipmentSetting) {
		this.currentEquipmentSetting = currentEquipmentSetting;
	}

	public String getNewEquipmentType() {
		return newEquipmentType;
	}

	public void setNewEquipmentType(String newEquipmentType) {
		this.newEquipmentType = newEquipmentType;
	}

	public String getNewEquipmentSetting() {
		return newEquipmentSetting;
	}

	public void setNewEquipmentSetting(String newEquipmentSetting) {
		this.newEquipmentSetting = newEquipmentSetting;
	}



	private String currentEquipmentSetting;
	private String newEquipmentType;
	private String newEquipmentSetting;

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

	

	@Override
	public String toString() {
		return "EquipmentWorkflowSubmit{" +
				"orderUnit='" + orderUnit + '\'' +
				", upt='" + upt + '\'' +
				", fromDate='" + fromDate + '\'' +
				", toDate='" + toDate + '\'' +
				", currentEquipmentType='" + currentEquipmentType + '\'' +
				", currentEquipmentSetting='" + currentEquipmentSetting + '\'' +
				", newEquipmentType='" + newEquipmentType + '\'' +
				", newEquipmentSetting='" + newEquipmentSetting + '\'' +
				'}';
	}
}