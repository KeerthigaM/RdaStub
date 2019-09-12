package com.mns.domain;

public class Depots {

	private String storeCode;
	private String siteName;

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(final String siteName) {
		this.siteName = siteName;
	}

	public String getStoreCode() {
		return storeCode;
	}

	public void setStoreCode(final String storeCode) {
		this.storeCode = storeCode;
	}

	@Override
	public String toString() {
		return "Depots{" +
				"storeCode='" + storeCode + '\'' +
				", siteName='" + siteName + '\'' +
				'}';
	}
}
