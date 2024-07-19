package com.reportGenerator;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.reportGenerator.service.ReportService;
import com.reportGenerator.service.SchedulerService;

public class SchedulerServiceTest {

	@InjectMocks
	private SchedulerService schedulerService;

	@Mock
	private ReportService reportService;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	void testScheduleReportGeneration() {
		schedulerService.scheduleReportGeneration();
		verify(reportService).generateReport();
	}
}
