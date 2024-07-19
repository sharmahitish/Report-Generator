package com.reportGenerator.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OutputRecord {

	private String outfield1;
	private String outfield2;
	private String outfield3;
	private String outfield4;
	private String outfield5;

	// Getters and setters
	public String getOutfield1() {
		return outfield1;
	}

	public void setOutfield1(String outfield1) {
		this.outfield1 = outfield1;
	}

	public String getOutfield2() {
		return outfield2;
	}

	public void setOutfield2(String outfield2) {
		this.outfield2 = outfield2;
	}

	public String getOutfield3() {
		return outfield3;
	}

	public void setOutfield3(String outfield3) {
		this.outfield3 = outfield3;
	}

	public String getOutfield4() {
		return outfield4;
	}

	public void setOutfield4(String outfield4) {
		this.outfield4 = outfield4;
	}

	public String getOutfield5() {
		return outfield5;
	}

	public void setOutfield5(String outfield5) {
		this.outfield5 = outfield5;
	}

	// toString method for CSV writing
	@Override
	public String toString() {
		return outfield1 + "," + outfield2 + "," + outfield3 + "," + outfield4 + "," + outfield5;
	}

	// All-args constructor
	public OutputRecord(String outfield1, String outfield2, String outfield3, String outfield4, String outfield5) {
		this.outfield1 = outfield1;
		this.outfield2 = outfield2;
		this.outfield3 = outfield3;
		this.outfield4 = outfield4;
		this.outfield5 = outfield5;
	}
}
