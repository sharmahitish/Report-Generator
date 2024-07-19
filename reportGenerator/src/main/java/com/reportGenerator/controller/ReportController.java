package com.reportGenerator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reportGenerator.service.ReportService;

@RestController
public class ReportController {
	@Autowired
	private ReportService reportService;

	@GetMapping("/generateReport")
	public String generateReport() {
		reportService.generateReport();
		return "Report generation started.";
	}
}