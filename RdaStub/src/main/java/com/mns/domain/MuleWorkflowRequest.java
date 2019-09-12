package com.mns.domain;

import java.util.Arrays;

/**
 * This class holds the objects that are used to communicate with Mule.
 */
public class MuleWorkflowRequest {

	/** Overall vendor number */
	private String vendorNo;
	private String articleNo;
	private String upc;
	private CostPriceWorkflowSubmit[] costPrice;
	private SupplyChainWorkflowSubmit[] supplyChain;
	private EquipmentWorkflowSubmit[] equipment;

	private UnitWeightSubmit[] unitWeight;

	private TrayWeightSubmit[] trayWeight;

	private String ragStatus;
	/** APPROVED/REJECTED */
	private String workflowStatus;
	private String currency;
	private String reasonCode;
	/** Specific vendor name/number */
	private String requestor;
	private boolean bradfordProduct;
	
	public boolean isBradfordProduct() {
		return bradfordProduct;
	}
	
	public void setBradfordProduct(boolean bradfordProduct) {
		this.bradfordProduct = bradfordProduct;
	}
	public String getRagStatus() {
		return ragStatus;
	}

	public void setRagStatus(final String ragStatus) {
		this.ragStatus = ragStatus;
	}

	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(final String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public CostPriceWorkflowSubmit[] getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(final CostPriceWorkflowSubmit[] costPrice) {
		this.costPrice = costPrice;
	}

	public SupplyChainWorkflowSubmit[] getSupplyChain() {
		return supplyChain;
	}

	public void setSupplyChain(final SupplyChainWorkflowSubmit[] supplyChain) {
		this.supplyChain = supplyChain;
	}

	public UnitWeightSubmit[] getUnitWeight() {
		return unitWeight;
	}

	public void setUnitWeight(final UnitWeightSubmit[] unitWeight) {
		this.unitWeight = unitWeight;
	}

	public TrayWeightSubmit[] getTrayWeight() {
		return trayWeight;
	}

	public void setTrayWeight(final TrayWeightSubmit[] trayWeight) {
		this.trayWeight = trayWeight;
	}

	public String getWorkflowStatus() {
		return workflowStatus;
	}

	public void setWorkflowStatus(final String workflowStatus) {
		this.workflowStatus = workflowStatus;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(final String currency) {
		this.currency = currency;
	}

	public String getRequestor() {
		return requestor;
	}

	public void setRequestor(final String requestor) {
		this.requestor = requestor;
	}

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

	public EquipmentWorkflowSubmit[] getEquipment() {
		return equipment;
	}

	public void setEquipment(final EquipmentWorkflowSubmit[] equipment) {
		this.equipment = equipment;
	}

	@Override
	public String toString() {
		return "MuleWorkflowRequest{" +
				"vendorNo='" + vendorNo + '\'' +
				", articleNo='" + articleNo + '\'' +
				", upc='" + upc + '\'' +
				", costPrice=" + Arrays.toString(costPrice) +
				", supplyChain=" + Arrays.toString(supplyChain) +
				", equipment=" + Arrays.toString(equipment) +
				", unitWeight=" + Arrays.toString(unitWeight) +
				", trayWeight=" + Arrays.toString(trayWeight) +
				", ragStatus='" + ragStatus + '\'' +
				", workflowStatus='" + workflowStatus + '\'' +
				", currency='" + currency + '\'' +
				", reasonCode='" + reasonCode + '\'' +
				", requestor='" + requestor + '\'' +
				", bradfordProduct='" + bradfordProduct + '\'' +
				'}';
	}
}
