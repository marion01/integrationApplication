package fr.isima.cuicuizz.model;

public class QuestionModel {

	private int id;
	private String question;
	private int themeId;
	private AnswerModel answer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getThemeId() {
		return themeId;
	}

	public void setThemeId(int themeId) {
		this.themeId = themeId;
	}

	public AnswerModel getAnswer() {
		return answer;
	}

	public void setAnswer(AnswerModel answer) {
		this.answer = answer;
	}

}
