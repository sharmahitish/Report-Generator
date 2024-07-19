package com.reportGenerator.model;

import com.opencsv.bean.CsvBindByName;

import lombok.Data;

@Data
public class InputRecord {

	@CsvBindByName
	private String field1;
	@CsvBindByName
	private String field2;
	@CsvBindByName
	private String field3;
	@CsvBindByName
	private double field5;
	@CsvBindByName
	private String refkey1;
	@CsvBindByName
	private String refkey2;

	// No-args constructor
	public InputRecord() {
	}

	// All-args constructor
	public InputRecord(String field1, String field2, String field3, double field5, String refkey1, String refkey2) {
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
		this.field5 = field5;
		this.refkey1 = refkey1;
		this.refkey2 = refkey2;
	}

	// Getters and setters
	public String getField1() {
		return field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	public String getField2() {
		return field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	public String getField3() {
		return field3;
	}

	public void setField3(String field3) {
		this.field3 = field3;
	}

	public double getField5() {
		return field5;
	}

	public void setField5(double field5) {
		this.field5 = field5;
	}

	public String getRefkey1() {
		return refkey1;
	}

	public void setRefkey1(String refkey1) {
		this.refkey1 = refkey1;
	}

	public String getRefkey2() {
		return refkey2;
	}

	public void setRefkey2(String refkey2) {
		this.refkey2 = refkey2;
	}
}
