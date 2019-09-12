package com.mns.domain.message;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * The Class ErrorMessage.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorMessage extends Message {

	//Fields
	private List<String> fieldErrors;
	private String errorKey;
	private String moreInfo;


	/**
	 * Instantiates a new error message.
	 */
	public ErrorMessage() {
	}

	//Getters and Setters

	public List<String> getFieldErrors() {
		return fieldErrors;
	}

	public void setFieldErrors(final List<String> fieldErrors) {
		this.fieldErrors = fieldErrors;
	}

	public String getErrorKey() {
		return errorKey;
	}

	public void setErrorKey(final String errorKey) {
		this.errorKey = errorKey;
	}

	public String getMoreInfo() {
		return moreInfo;
	}

	public void setMoreInfo(final String moreInfo) {
		this.moreInfo = moreInfo;
	}

	@Override
	public String toString() {
		return "ErrorMessage{" +
				"fieldErrors=" + fieldErrors +
				", errorKey='" + errorKey + '\'' +
				", moreInfo='" + moreInfo + '\'' +
				'}';
	}
}

