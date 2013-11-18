package br.com.hine.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.hine.model.Exam;
import br.com.hine.service.ExamService;

@Controller
public class ExamController {

	private static final Logger logger = LoggerFactory.getLogger(ExamController.class);

	@Autowired
	private ExamService examService;

	@RequestMapping(value = "exam/random/{numOfQuestions}", method = RequestMethod.GET)
	public void generateRandomExam(@PathVariable Integer numOfQuestions, HttpServletResponse response) throws IOException {
		logger.info("Generating a Random Exam...");

		Exam exam = examService.createRandomExam(numOfQuestions);

		response.setContentType("application/doc");
		response.setHeader("Content-Disposition", "attachment;filename=" + exam.getName() + ".docx");

		examService.exportExamToDoc(exam, response.getOutputStream());
	}

}
