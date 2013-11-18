package br.com.hine.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import br.com.hine.model.Exam;

@RunWith(JUnit4.class)
public class DefaultExamServiceTest {

	private DefaultExamService examService = new DefaultExamService();

	@Test
	public void shouldCreateExamWithTenQuestions() {
		Integer expected = 10;

		Exam testExam = examService.createRandomExam(expected);

		Assert.assertEquals(expected, testExam.getNumOfQuestions());
	}

}
