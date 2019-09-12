package com.mns.domain;

public class Vendor {

	private String vendorNo;
	private String vendorName;

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(final String vendorName) {
		this.vendorName = vendorName;
	}

	public String getVendorNo() {
		return vendorNo;
	}

	public void setVendorNo(final String vendorNo) {
		this.vendorNo = vendorNo;
	}

	@Override
	public String toString() {
		return "Vendor{" +
				"vendorNo='" + vendorNo + '\'' +
				", vendorName='" + vendorName + '\'' +
				'}';
	}
}
