package br.com.hine.service;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.hine.model.Answer;
import br.com.hine.model.Exam;
import br.com.hine.model.MultipleChoiceQuestion;
import br.com.hine.model.Question;

@Service
public class DefaultExamService implements ExamService {

	@Override
	public Exam createRandomExam(Integer numOfQuestions) {
		Exam exam = createExam(numOfQuestions);

		return exam;
	}

	private Exam createExam(Integer numOfQuestions) {
		Exam exam = new Exam();
		exam.setId(1);
		exam.setName("Sample");
		List<Question> questions = new ArrayList<Question>();
		exam.setQuestions(questions);

		Question question = createQuestion();

		for (int i = 0; i < numOfQuestions; i++) {
			questions.add(question);
		}

		return exam;
	}

	private Question createQuestion() {
		MultipleChoiceQuestion question = new MultipleChoiceQuestion();
		
		List<Answer> choices = new ArrayList<Answer>();
		for (int i = 0; i < 5; i++) {
			Answer answer = new Answer();
			answer.setLetter(String.valueOf(i));
			answer.setDescription("option_" + i);
			choices.add(answer);
		}
		
		question.setChoices(choices);
		
		return question;
	}

	@Override
	public void exportExamToDoc(Exam exam, OutputStream out) {
		// TODO Auto-generated method stub
	}

}
