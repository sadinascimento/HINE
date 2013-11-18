package br.com.hine.service;

import java.io.OutputStream;

import br.com.hine.model.Exam;

public interface ExamExporter {
	
	void export(Exam exam, OutputStream outputStream);

}
