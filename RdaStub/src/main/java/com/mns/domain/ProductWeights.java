package com.mns.domain;

/**
 * This class is for the loose weight products. These products have tray weights and unit weights. It corresponds to RFC2B.
 */
public class ProductWeights {

	private String vendorNo;
	private String articleNo;
	private String upc;
	private String unitWeightValidFromDate;
	private String unitWeightValidToDate;
	private String trayWeightValidFromDate;
	private String trayWeightValidToDate;
	/** This is in grams */
	private String unitNetWeight;
	/** This is in grams */
	private String packNetContent;
	/** This is in kilograms */
	private String trayNetWeight;
	/** This is in kilograms */
	private String trayGrossWeight;
	private String upt;

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

	public String getUnitWeightValidFromDate() {
		return unitWeightValidFromDate;
	}

	public void setUnitWeightValidFromDate(final String unitWeightValidFromDate) {
		this.unitWeightValidFromDate = unitWeightValidFromDate;
	}

	public String getUnitWeightValidToDate() {
		return unitWeightValidToDate;
	}

	public void setUnitWeightValidToDate(final String unitWeightValidToDate) {
		this.unitWeightValidToDate = unitWeightValidToDate;
	}

	public String getTrayWeightValidFromDate() {
		return trayWeightValidFromDate;
	}

	public void setTrayWeightValidFromDate(final String trayWeightValidFromDate) {
		this.trayWeightValidFromDate = trayWeightValidFromDate;
	}

	public String getTrayWeightValidToDate() {
		return trayWeightValidToDate;
	}

	public void setTrayWeightValidToDate(final String trayWeightValidToDate) {
		this.trayWeightValidToDate = trayWeightValidToDate;
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

	public String getTrayNetWeight() {
		return trayNetWeight;
	}

	public void setTrayNetWeight(final String trayNetWeight) {
		this.trayNetWeight = trayNetWeight;
	}

	public String getTrayGrossWeight() {
		return trayGrossWeight;
	}

	public void setTrayGrossWeight(final String trayGrossWeight) {
		this.trayGrossWeight = trayGrossWeight;
	}

	public String getUpt() {
		return upt;
	}

	public void setUpt(final String upt) {
		this.upt = upt;
	}

	@Override
	public String toString() {
		return "ProductWeights{" +
				"vendorNo='" + vendorNo + '\'' +
				", articleNo='" + articleNo + '\'' +
				", upc='" + upc + '\'' +
				", unitWeightValidFromDate='" + unitWeightValidFromDate + '\'' +
				", unitWeightValidToDate='" + unitWeightValidToDate + '\'' +
				", trayWeightValidFromDate='" + trayWeightValidFromDate + '\'' +
				", trayWeightValidToDate='" + trayWeightValidToDate + '\'' +
				", unitNetWeight='" + unitNetWeight + '\'' +
				", packNetContent='" + packNetContent + '\'' +
				", trayNetWeight='" + trayNetWeight + '\'' +
				", trayGrossWeight='" + trayGrossWeight + '\'' +
				", upt='" + upt + '\'' +
				'}';
	}
}
