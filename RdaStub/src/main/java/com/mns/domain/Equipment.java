package com.mns.domain;

public class Equipment {

	private String equipmentType;
	private String equipmentSetting;

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

	@Override
	public String toString() {
		return "Equipment{" +
				"equipmentType='" + equipmentType + '\'' +
				", equipmentSetting='" + equipmentSetting + '\'' +
				'}';
	}
}
