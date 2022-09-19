package com.restapi.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
		
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic(001, "The Rose", "The Rose is an arial play of Rome"),
				new Topic(002, "The Candidate", "Candidate of purpose"),
				new Topic(003, "Green Attack", "Troublesome green aliens abuse"),
				new Topic(004, "The Graduate", "The university graduate experience")		
		);
	}
	
}
