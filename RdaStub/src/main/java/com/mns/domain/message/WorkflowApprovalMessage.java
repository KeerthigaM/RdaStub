package com.mns.domain.message;

public class WorkflowApprovalMessage {

	private String workflowStatus;
	private String workflowMessage;
	private String workflowId;

	public String getWorkflowStatus() {
		return workflowStatus;
	}

	public void setWorkflowStatus(final String workflowStatus) {
		this.workflowStatus = workflowStatus;
	}

	public String getWorkflowMessage() {
		return workflowMessage;
	}

	public void setWorkflowMessage(final String workflowMessage) {
		this.workflowMessage = workflowMessage;
	}

	public String getWorkflowId() {
		return workflowId;
	}

	public void setWorkflowId(final String workflowId) {
		this.workflowId = workflowId;
	}

	@Override
	public String toString() {
		return "WorkflowApprovalMessage{" +
				"workflowStatus='" + workflowStatus + '\'' +
				", workflowMessage='" + workflowMessage + '\'' +
				", workflowId='" + workflowId + '\'' +
				'}';
	}
}
