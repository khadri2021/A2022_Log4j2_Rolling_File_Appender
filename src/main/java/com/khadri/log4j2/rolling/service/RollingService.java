package com.khadri.log4j2.rolling.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.khadri.log4j2.rolling.model.Student;
import com.khadri.log4j2.rolling.model.StudentRequest;
import com.khadri.log4j2.rolling.model.StudentResponse;

@Service
public class RollingService {

	@Autowired
	private RestTemplate restTemplate;

	public void invokeService(StudentRequest studentRequest) {

		Student student = new Student.StudentBuilder().withAddress(studentRequest.getAddress())
				.withSport(studentRequest.getSport()).withMarks(studentRequest.getMarks())
				.withCollege(studentRequest.getCollege()).withId(111).withName("JHON").build();

		restTemplate.postForEntity("https://webhook.site/429a777e-0d5c-4540-b06a-52a5a421e8cd", studentRequest, StudentResponse.class);
	}
}
