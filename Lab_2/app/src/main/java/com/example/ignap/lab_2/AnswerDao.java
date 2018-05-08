package com.example.ignap.lab_2;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface AnswerDao {

    @Insert
    void insertOnlyAnswer (Answer answer);
    @Insert
    void insertMultipleAnswer (List<Answer> answer);
    @Query("SELECT * FROM Answer WHERE answerId = :answerId")
    Answer fetchOneAnswerbyAnswerId (int answerId);
    @Update
    void updateAnswer (Answer answer);
    @Delete
    void deleteAnswer (Answer answer);


    @Query("SELECT * FROM Answer ORDER BY answerId desc limit 1")
    Answer fetchHighestId ();
}