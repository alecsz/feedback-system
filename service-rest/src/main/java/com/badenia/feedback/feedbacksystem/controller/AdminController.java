package com.badenia.feedback.feedbacksystem.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.badenia.feedback.feedbacksystem.service.model.QuestionType;

import lombok.AccessLevel;
import lombok.Getter;

@RestController
@RequestMapping("/v1/feedback/admin")
@Getter(value = AccessLevel.PROTECTED)
public class AdminController {

	@GetMapping(path = {"/questionTypes"},consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<String>> readQuestionTypes() {
		return ResponseEntity.ok(Arrays.asList(QuestionType.values()).stream().map(QuestionType::name).collect(Collectors.toList()));
	}
	
}
