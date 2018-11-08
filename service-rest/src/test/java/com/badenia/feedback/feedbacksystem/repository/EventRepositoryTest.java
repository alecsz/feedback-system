package com.badenia.feedback.feedbacksystem.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.time.Instant;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.badenia.feedback.feedbacksystem.repository.model.EventTableModel;

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
		assertTrue(list.contains(new EventTableModel(-1L, "", "", Date.from(Instant.parse("2018-10-10T08:00:00.00Z")), Date.from(Instant.parse("2018-10-12T08:00:00.00Z")))));
	}
	
}
