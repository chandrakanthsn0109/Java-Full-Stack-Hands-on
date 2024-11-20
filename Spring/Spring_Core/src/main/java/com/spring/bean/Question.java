package com.spring.bean;

import java.util.List;

public class Question {
	
	private int qid;
	private String question;
	private List<String> answers;
	
	public Question() {
		super();
	}
	
	public Question(int qid, String question, List<String> answers) {
		super();
		this.qid = qid;
		this.question = question;
		this.answers = answers;
	}
	
	public int getQid() {
		return qid;
	}
	
	public void setQid(int qid) {
		this.qid = qid;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public List<String> getAnswers() {
		return answers;
	}
	
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	
	@Override
	public String toString() {
		return "Question [qid=" + qid + ", queastion=" + question + ", answers=" + answers + "]";
	}
	
}
