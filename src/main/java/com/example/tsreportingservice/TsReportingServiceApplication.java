package com.example.tsreportingservice;

import com.example.tsreportingservice.service.QueueProcessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class TsReportingServiceApplication {
	@Autowired
	QueueProcessingService queueProcessingService;
	public static void main(String[] args) {
		SpringApplication.run(TsReportingServiceApplication.class, args);
	}

	@PostConstruct
	public void startRedis() {
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("^^QueueProcessingService subscription");
//		queueProcessingService.processQueue();
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	}
}
