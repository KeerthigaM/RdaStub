package com.mns.domain.message;

public class WorkflowCreationMessage extends Message {


	private String workflowId;
	private String createdBy;
	private String workflowMessage;

	public String getWorkflowId() {
		return workflowId;
	}

	public void setWorkflowId(final String workflowId) {
		this.workflowId = workflowId;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(final String createdBy) {
		this.createdBy = createdBy;
	}

	public String getWorkflowMessage() {
		return workflowMessage;
	}

	public void setWorkflowMessage(final String workflowMessage) {
		this.workflowMessage = workflowMessage;
	}

	@Override
	public String toString() {
		return "WorkflowCreationMessage{" +
				"workflowId='" + workflowId + '\'' +
				", createdBy='" + createdBy + '\'' +
				", workflowMessage='" + workflowMessage + '\'' +
				'}';
	}
}
