package com.badenia.feedback.feedbacksystem.service.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.badenia.feedback.feedbacksystem.service.repository.EventRepository;
import com.badenia.feedback.feedbacksystem.service.repository.model.EventTableModel;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class EventRepositoryTest {

	@Autowired
	EventRepository underTest;
	
	@Test
	public void testFindAll() {
		List<EventTableModel> list = underTest.findAll();
		assertNotNull(list);
		assertEquals(2, list.size());
		assertTrue(list.contains(new EventTableModel(1L, "Tägliche Essen-Umfrage")));
	}
	
}
