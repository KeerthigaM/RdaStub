package com.mns.domain;

public class Category {

	private String category;
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(final String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Category{" +
				"category='" + category + '\'' +
				", description='" + description + '\'' +
				'}';
	}
}
