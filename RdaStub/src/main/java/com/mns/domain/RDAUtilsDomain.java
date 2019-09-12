package com.mns.domain;

/**
 * Created by b8605521 on 06/06/2016.
 */
public class RDAUtilsDomain {

	private String londonDateTime;

	public String getLondonDateTime() {
		return londonDateTime;
	}

	public void setLondonDateTime(final String londonDateTime) {
		this.londonDateTime = londonDateTime;
	}

	@Override
	public String toString() {
		return "RDAUtilsDomain{" +
				"londonDateTime='" + londonDateTime + '\'' +
				'}';
	}
}
