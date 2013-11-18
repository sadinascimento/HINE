package br.com.hine.service;

import java.io.OutputStream;

import br.com.hine.model.Exam;

public interface ExamService {
	
	Exam createRandomExam(Integer numOfQuestions);
	
	void exportExamToDoc(Exam exam, OutputStream out);

}
