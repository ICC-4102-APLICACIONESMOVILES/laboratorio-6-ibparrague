package com.example.ignap.lab_2;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(foreignKeys = @ForeignKey(entity = Form.class, parentColumns = "formId",childColumns = "parentFormId"))
public class Question {
    @NonNull
    @PrimaryKey
    private String questionId;
    private String questionName;
    private String questionDesc;


    private String parentFormId;

    public Question() {
    }

    public String getQuestionId() { return questionId; }
    public void setQuestionId(String questionId) { this.questionId = questionId; }

    public String getQuestionName() { return questionName; }
    public void setQuestionName (String questionName) { this.questionName = questionName; }

    public String getQuestionDesc() { return questionDesc; }
    public void setQuestionDesc(String questionDesc) { this.questionDesc = questionDesc;}

    public String getParentFormId() { return parentFormId; }
    public void setParentFormId(String parentFormId) { this.parentFormId = parentFormId;}
}