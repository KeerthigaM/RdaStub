package com.mns.domain.message;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder(value = { "upc","description","vendorCode", "category", "dualSupply", "siteName", "ragStatus", "reason", "creationDate", "vendorUserName", "uptCurrent", "uptNew", "uptNewFromDate", "uptNewToDate", "costPriceCurrent", "costPriceNew", "costPriceNewFromDate",
"costPriceNewToDate", "costPriceUpt", "newEquipmentType", "newEquipmentSetting", "currentEquipmentType", "currentEquipmentSetting", "equipmentFromDate", "equipmentToDate", "equipmentUpt", "backendStatus", "buyerName", "actionDate"})
public class SupplierCsvReport extends CsvReport {

	public String costPriceCurrent;
	public String costPriceNew;
	public String costPriceNewFromDate;
	public String costPriceNewToDate;
	public String costPriceUpt;
	public String currentEquipmentType;
	public String currentEquipmentSetting;
	public String newEquipmentType;
	public String newEquipmentSetting;
	public String equipmentFromDate;
	public String equipmentToDate;
	public String equipmentUpt;
	public String actionDate;
	public String buyerName;

	public String getCostPriceCurrent() {
		return costPriceCurrent;
	}

	public void setCostPriceCurrent(String costPriceCurrent) {
		this.costPriceCurrent = costPriceCurrent;
	}

	public String getCostPriceNew() {
		return costPriceNew;
	}

	public void setCostPriceNew(String costPriceNew) {
		this.costPriceNew = costPriceNew;
	}

	public String getCostPriceNewFromDate() {
		return costPriceNewFromDate;
	}

	public void setCostPriceNewFromDate(String costPriceNewFromDate) {
		this.costPriceNewFromDate = costPriceNewFromDate;
	}

	public String getCostPriceNewToDate() {
		return costPriceNewToDate;
	}

	public void setCostPriceNewToDate(String costPriceNewToDate) {
		this.costPriceNewToDate = costPriceNewToDate;
	}

	public String getCostPriceUpt() {
		return costPriceUpt;
	}

	public void setCostPriceUpt(String costPriceUpt) {
		this.costPriceUpt = costPriceUpt;
	}

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

	public String getEquipmentFromDate() {
		return equipmentFromDate;
	}

	public void setEquipmentFromDate(String equipmentFromDate) {
		this.equipmentFromDate = equipmentFromDate;
	}

	public String getEquipmentToDate() {
		return equipmentToDate;
	}

	public void setEquipmentToDate(String equipmentToDate) {
		this.equipmentToDate = equipmentToDate;
	}

	public String getEquipmentUpt() {
		return equipmentUpt;
	}

	public void setEquipmentUpt(String equipmentUpt) {
		this.equipmentUpt = equipmentUpt;
	}

	public String getActionDate() {
		return actionDate;
	}

	public void setActionDate(String actionDate) {
		this.actionDate = actionDate;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	@Override
	public String toString() {
		return "CsvReportForSCP{" +
				"upc='" + upc + '\'' +
				", description='" + description + '\'' +
	 			", vendorCode='" + vendorCode + '\'' +
	 			", category='" + category + '\'' +
	 			", dualSupply='" + dualSupply + '\'' +
	 			", siteName='" + siteName + '\'' +
	 			", ragStatus='" + ragStatus + '\'' +
	 			", reason='" + reason + '\'' +
	 			", creationDate='" + creationDate + '\'' +
	 			", vendorUserName='" + vendorUserName + '\'' +
	 			", uptCurrent='" + uptCurrent + '\'' +
				", uptNew='" + uptNew + '\'' +
				", uptNewFromDate='" + uptNewFromDate + '\'' +
				", uptNewToDate='" + uptNewToDate + '\'' +
				", costPriceCurrent='" + costPriceCurrent + '\'' +
				", costPriceNew='" + costPriceNew + '\'' +
				", costPriceNewFromDate='" + costPriceNewFromDate + '\'' +
				 ", costPriceNewToDate='" + costPriceNewToDate + '\'' +
				 ", costPriceUpt='" + costPriceUpt + '\'' +
                 ", newEquipmentType='" + newEquipmentType + '\'' +
                 ", newEquipmentSetting='" + newEquipmentSetting + '\'' +
                 ", currentEquipmentType='" + currentEquipmentType + '\'' +
                 ", currentEquipmentSetting='" + currentEquipmentSetting + '\'' +
                 ", equipmentFromDate='" + equipmentFromDate + '\'' +
                 ", equipmentToDate='" + equipmentToDate + '\'' +
                 ", equipmentUpt='" + equipmentUpt + '\'' +
                 ", backendStatus='" + backendStatus + '\'' +
                 ", buyerName='" + buyerName + '\'' +
                 ", actionDate='" + actionDate + '\'' +
				 '}';
	}

	
}
