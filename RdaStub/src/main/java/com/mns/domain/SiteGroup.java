package com.mns.domain;

public class SiteGroup {

	private String classType;
	private String siteGroup;
	private String siteGroupName;

	public String getClassType() {
		return classType;
	}

	public void setClassType(final String classType) {
		this.classType = classType;
	}

	public String getSiteGroup() {
		return siteGroup;
	}

	public void setSiteGroup(final String siteGroup) {
		this.siteGroup = siteGroup;
	}

	public String getSiteGroupName() {
		return siteGroupName;
	}

	public void setSiteGroupName(final String siteGroupName) {
		this.siteGroupName = siteGroupName;
	}

	@Override
	public String toString() {
		return "SiteGroup{" +
				"classType='" + classType + '\'' +
				", siteGroup='" + siteGroup + '\'' +
				", siteGroupName='" + siteGroupName + '\'' +
				'}';
	}
}
