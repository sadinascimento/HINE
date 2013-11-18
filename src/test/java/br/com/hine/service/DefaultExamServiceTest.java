package br.com.hine.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.io.OutputStream;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import br.com.hine.model.Exam;

@RunWith(MockitoJUnitRunner.class)
public class DefaultExamServiceTest {

	private DefaultExamService examService;

	@Mock
	private ExamExporter exporter;

	@Mock
	private OutputStream outputStream;

	@Mock
	private Exam exam;

	@Before
	public void setup() {
		examService = new DefaultExamService();
		examService.setExporter(exporter);
	}

	@Test
	public void shouldCreateExamWithTenQuestions() {
		Integer expected = 10;

		Exam testExam = examService.createRandomExam(expected);

		assertEquals(expected, testExam.getNumOfQuestions());
	}

	@Test
	public void shouldInvokeExporter() {
		examService.exportExamToDoc(exam, outputStream);
		verify(exporter, times(1)).export(exam, outputStream);
	}

}
