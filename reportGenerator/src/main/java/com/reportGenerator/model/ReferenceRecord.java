package com.reportGenerator.model;

import com.opencsv.bean.CsvBindByName;
import lombok.Data;

@Data
public class ReferenceRecord {

	@CsvBindByName
	private String refkey1;
	@CsvBindByName
	private String refdata1;
	@CsvBindByName
	private String refkey2;
	@CsvBindByName
	private String refdata2;
	@CsvBindByName
	private String refdata3;
	@CsvBindByName
	private double refdata4;

	// No-args constructor
	public ReferenceRecord() {
	}

	// All-args constructor
	public ReferenceRecord(String refkey1, String refdata1, String refkey2, String refdata2, String refdata3,
			double refdata4) {
		this.refkey1 = refkey1;
		this.refdata1 = refdata1;
		this.refkey2 = refkey2;
		this.refdata2 = refdata2;
		this.refdata3 = refdata3;
		this.refdata4 = refdata4;
	}

	// Getters and setters
	public String getRefkey1() {
		return refkey1;
	}

	public void setRefkey1(String refkey1) {
		this.refkey1 = refkey1;
	}

	public String getRefdata1() {
		return refdata1;
	}

	public void setRefdata1(String refdata1) {
		this.refdata1 = refdata1;
	}

	public String getRefkey2() {
		return refkey2;
	}

	public void setRefkey2(String refkey2) {
		this.refkey2 = refkey2;
	}

	public String getRefdata2() {
		return refdata2;
	}

	public void setRefdata2(String refdata2) {
		this.refdata2 = refdata2;
	}

	public String getRefdata3() {
		return refdata3;
	}

	public void setRefdata3(String refdata3) {
		this.refdata3 = refdata3;
	}

	public double getRefdata4() {
		return refdata4;
	}

	public void setRefdata4(double refdata4) {
		this.refdata4 = refdata4;
	}
}
