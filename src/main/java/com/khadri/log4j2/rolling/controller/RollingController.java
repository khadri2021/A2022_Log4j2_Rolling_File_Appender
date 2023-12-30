package com.khadri.log4j2.rolling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khadri.log4j2.rolling.aspect.LogFile;
import com.khadri.log4j2.rolling.logger.AppLogger;
import com.khadri.log4j2.rolling.model.StudentRequest;
import com.khadri.log4j2.rolling.service.RollingService;

@RestController
@RequestMapping("roll/v1")
public class RollingController {

	@Autowired
	private RollingService rollingService;

	@GetMapping("/get/student")
	@LogFile(request = "#args[0]")
	public ResponseEntity<StudentRequest> getStudent(@RequestBody StudentRequest studentRequest) {
		AppLogger.info("Hello");

		rollingService.invokeService(studentRequest);

		return new ResponseEntity<StudentRequest>(studentRequest, HttpStatus.ACCEPTED);
	}

}
