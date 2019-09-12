package com.mns.domain;

import java.util.Arrays;

public class SupplyChainChange {

	private String currentOrderUnit;
	private String newOrderUnit;
	private String currentUPT;
	private String newUPT;
	private String fromDate;
	private String endDate;

	private String siteGroup;
	private Depots[] depots;

	public String getCurrentOrderUnit() {
		return currentOrderUnit;
	}

	public void setCurrentOrderUnit(final String currentOrderUnit) {
		this.currentOrderUnit = currentOrderUnit;
	}

	public String getNewOrderUnit() {
		return newOrderUnit;
	}

	public void setNewOrderUnit(final String newOrderUnit) {
		this.newOrderUnit = newOrderUnit;
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

	public String getCurrentUPT() {
		return currentUPT;
	}

	public void setCurrentUPT(final String currentUPT) {
		this.currentUPT = currentUPT;
	}

	public String getNewUPT() {
		return newUPT;
	}

	public void setNewUPT(final String newUPT) {
		this.newUPT = newUPT;
	}

	public String getSiteGroup() {
		return siteGroup;
	}

	public void setSiteGroup(final String siteGroup) {
		this.siteGroup = siteGroup;
	}

	public Depots[] getDepots() {
		return depots;
	}

	public void setDepots(final Depots[] depots) {
		this.depots = depots;
	}

	@Override
	public String toString() {
		return "SupplyChainChange{" +
				"currentOrderUnit='" + currentOrderUnit + '\'' +
				", newOrderUnit='" + newOrderUnit + '\'' +
				", currentUPT='" + currentUPT + '\'' +
				", newUPT='" + newUPT + '\'' +
				", fromDate='" + fromDate + '\'' +
				", endDate='" + endDate + '\'' +
				", siteGroup='" + siteGroup + '\'' +
				", depots=" + Arrays.toString(depots) +
				'}';
	}
}
