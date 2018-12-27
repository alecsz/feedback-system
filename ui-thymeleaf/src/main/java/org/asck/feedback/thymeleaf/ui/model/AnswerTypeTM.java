package org.asck.feedback.thymeleaf.ui.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AnswerTypeTM {
	
	private long id;
	private String answerType;

}