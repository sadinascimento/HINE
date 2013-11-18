package br.com.hine.model;

import java.util.List;

public class MultipleChoiceQuestion implements Question {

	private List<Answer> choices;

	private Answer corretAnswer;

	public List<Answer> getChoices() {
		return choices;
	}

	public void setChoices(List<Answer> choices) {
		this.choices = choices;
	}

	public Answer getCorretAnswer() {
		return corretAnswer;
	}

	public void setCorretAnswer(Answer corretAnswer) {
		this.corretAnswer = corretAnswer;
	}

}
