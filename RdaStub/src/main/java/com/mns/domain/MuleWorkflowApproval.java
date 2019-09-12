package com.mns.domain;

/**
 * Created by b8605521 on 21/03/2016.
 */
public class MuleWorkflowApproval {

	private String workflowId;
	private String workflowTitle;
	// buyer ID
	private String approverId;
	private String rejectionReasonCode;
	private String workflowStatus;
	private String role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getWorkflowId() {
		return workflowId;
	}

	public void setWorkflowId(final String workflowId) {
		this.workflowId = workflowId;
	}

	public String getWorkflowTitle() {
		return workflowTitle;
	}

	public void setWorkflowTitle(final String workflowTitle) {
		this.workflowTitle = workflowTitle;
	}

	public String getApproverId() {
		return approverId;
	}

	public void setApproverId(final String approverId) {
		this.approverId = approverId;
	}

	public String getRejectionReasonCode() {
		return rejectionReasonCode;
	}

	public void setRejectionReasonCode(final String rejectionReasonCode) {
		this.rejectionReasonCode = rejectionReasonCode;
	}

	public String getWorkflowStatus() {
		return workflowStatus;
	}

	public void setWorkflowStatus(final String workflowStatus) {
		this.workflowStatus = workflowStatus;
	}

	@Override
	public String toString() {
		return "MuleWorkflowApproval{" +
				"workflowId='" + workflowId + '\'' +
				", workflowTitle='" + workflowTitle + '\'' +
				", approverId='" + approverId + '\'' +
				", rejectionReasonCode='" + rejectionReasonCode + '\'' +
				", workflowStatus='" + workflowStatus + '\'' +
				'}';
	}
}
