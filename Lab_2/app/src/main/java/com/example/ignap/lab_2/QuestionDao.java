package com.example.ignap.lab_2;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface QuestionDao {

    @Insert
    void insertOnlySingleQuestion (Question question);
    @Insert
    void insertMultipleQuestion (List<Question> question);
    @Query("SELECT * FROM Question WHERE questionId = :questionId")
    Question fetchOneQuestionbyQuestionId (int questionId);
    @Update
    void updateQuestion (Question question);
    @Delete
    void deleteQuestion (Question question);


    @Query("SELECT * FROM Question ORDER BY questionId desc limit 1")
    Question fetchHighestId ();
}