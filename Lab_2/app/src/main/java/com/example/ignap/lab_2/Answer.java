package com.example.ignap.lab_2;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(foreignKeys = @ForeignKey(entity = Question.class, parentColumns = "questionId",childColumns = "parentQuestionId"))
public class Answer {
    @NonNull
    @PrimaryKey
    private String answerId;
    private String answerName;
    private String answerDesc;


    private String parentQuestionId;

    public Answer() {
    }

    public String getAnswerId() { return answerId; }
    public void setAnswerId(String answerId) { this.answerId = answerId; }

    public String getAnswerName() { return answerName; }
    public void setAnswerName (String answerName) { this.answerName = answerName; }

    public String getAnswerDesc() { return answerDesc; }
    public void setAnswerDesc(String answerDesc) { this.answerDesc = answerDesc;}

    public String getParentQuestionId() { return parentQuestionId; }
    public void setParentQuestionId(String parentQuestionId) { this.parentQuestionId = parentQuestionId;}
}