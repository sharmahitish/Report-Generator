package com.reportGenerator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SchedulerService {

	@Autowired
	private ReportService reportService;

	@Scheduled(cron = "0 0 * * * ?") // Every hour
	public void scheduleReportGeneration() {
		reportService.generateReport();
	}
}
