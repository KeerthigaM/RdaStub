package com.mns.domain.message;

import java.util.List;

public class CsvResponse {

	private final String filename;
	private final List<?> records;
	private final String role;

	public CsvResponse(final List<?> records, final String filename, final String role) {
		this.records = records;
		this.filename = filename;
		this.role = role;
	}

	public String getFilename() {
		return filename;
	}

	public List<?> getRecords() {
		return records;
	}
	public String getRole() {
		return role;
	}

	@Override
	public String toString() {
		return "CsvResponse{" +
				"filename='" + filename + '\'' +
				", records=" + records +
				", role=" + role +
				'}';
	}
}

