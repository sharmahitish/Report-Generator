package com.reportGenerator.service;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.opencsv.bean.CsvToBeanBuilder;
import com.reportGenerator.model.InputRecord;
import com.reportGenerator.model.OutputRecord;
import com.reportGenerator.model.ReferenceRecord;

@Service
public class ReportService {

	private static final Logger logger = LoggerFactory.getLogger(ReportService.class);

	public void generateReport() {
		logger.info("Starting report generation");
		try {
			// Read input and reference CSV files
			List<InputRecord> inputRecords = new CsvToBeanBuilder<InputRecord>(new FileReader("input.csv"))
					.withType(InputRecord.class).build().parse();
			logger.debug("Read {} input records", inputRecords.size());

			List<ReferenceRecord> referenceRecords = new CsvToBeanBuilder<ReferenceRecord>(
					new FileReader("reference.csv")).withType(ReferenceRecord.class).build().parse();
			logger.debug("Read {} reference records", referenceRecords.size());

			// Transform records based on rules
			List<OutputRecord> outputRecords = inputRecords.stream()
					.map(input -> transformRecord(input, referenceRecords)).collect(Collectors.toList());
			logger.debug("Transformed {} records", outputRecords.size());

			// Write output records to CSV file
			try (FileWriter writer = new FileWriter("output.csv")) {
				for (OutputRecord record : outputRecords) {
					writer.write(record.toString());
					writer.write("\n");
				}
			}
			logger.info("Report generated successfully");

		} catch (IOException e) {
			logger.error("Error generating report", e);
		}
	}

	public OutputRecord transformRecord(InputRecord input, List<ReferenceRecord> referenceRecords) {
		logger.debug("Transforming record with refkey1: {}, refkey2: {}", input.getRefkey1(), input.getRefkey2());

		// Find corresponding reference record
		ReferenceRecord ref = referenceRecords.stream()
				.filter(r -> r.getRefkey1().equals(input.getRefkey1()) && r.getRefkey2().equals(input.getRefkey2()))
				.findFirst().orElse(null);

		if (ref != null) {
			// Apply transformation rules
			String outfield1 = input.getField1() + input.getField2();
			String outfield2 = ref.getRefdata1();
			String outfield3 = ref.getRefdata2() + ref.getRefdata3();
			double maxField5 = Math.max(input.getField5(), ref.getRefdata4());
			double field3 = Double.parseDouble(input.getField3());
			String outfield4 = String.valueOf(field3 * maxField5);
			String outfield5 = String.valueOf(maxField5);

			return new OutputRecord(outfield1, outfield2, outfield3, outfield4, outfield5);
		}

		return null;
	}
}
