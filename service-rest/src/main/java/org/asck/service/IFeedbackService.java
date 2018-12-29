package org.asck.service;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.asck.exceptions.EntityNotFoundException;
import org.asck.service.model.Answer;
import org.asck.service.model.Event;
import org.asck.service.model.Question;

public interface IFeedbackService {

	List<Event> findEvents();

	Event findEventById(Long id) throws EntityNotFoundException;

	Question findQuestion(Long eventId, Long questionId) throws EntityNotFoundException;

	Long saveAnswer(Answer answer) throws EntityNotFoundException;

	Long saveEvent(@Valid Event event);

	Long save(@NotNull Long eventId, @Valid Question question);

	void deleteEvent(@NotNull Long eventId) throws EntityNotFoundException;

	void deleteQuestion(@NotNull Long eventId, @NotNull Long questionId) throws EntityNotFoundException;

}
