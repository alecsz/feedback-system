package com.badenia.feedback.thymeleaf.ui.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UIEventTM {

	private Long id;
	
	private String eventName;
	
}
