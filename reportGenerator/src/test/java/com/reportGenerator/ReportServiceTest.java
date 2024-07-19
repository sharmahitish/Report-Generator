package com.reportGenerator;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.reportGenerator.model.InputRecord;
import com.reportGenerator.model.OutputRecord;
import com.reportGenerator.model.ReferenceRecord;
import com.reportGenerator.service.ReportService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReportServiceTest {

	private ReportService reportService;

	@BeforeEach
	public void setUp() {
		reportService = new ReportService();
	}

	@Test
	public void testTransformRecord() {
		InputRecord input = new InputRecord("A", "B", "2.5", 10.0, "key1", "key2");
		ReferenceRecord reference = new ReferenceRecord("key1", "refData1", "key2", "refData2", "refData3", 5.0);
		List<ReferenceRecord> referenceRecords = Arrays.asList(reference);

		OutputRecord expected = new OutputRecord("AB", "refData1", "refData2refData3", "12.5", "10.0");
		OutputRecord actual = reportService.transformRecord(input, referenceRecords);

		assertEquals(expected.getOutfield1(), actual.getOutfield1());
		assertEquals(expected.getOutfield2(), actual.getOutfield2());
		assertEquals(expected.getOutfield3(), actual.getOutfield3());
		assertEquals(expected.getOutfield4(), actual.getOutfield4());
		assertEquals(expected.getOutfield5(), actual.getOutfield5());
	}
}
