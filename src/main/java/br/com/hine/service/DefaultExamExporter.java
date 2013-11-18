package br.com.hine.service;

import java.io.OutputStream;

import org.springframework.stereotype.Component;

import br.com.hine.model.Exam;

@Component
public class DefaultExamExporter implements ExamExporter {

	@Override
	public void export(Exam exam, OutputStream outputStream) {
		// TODO Auto-generated catch block
	}

}
