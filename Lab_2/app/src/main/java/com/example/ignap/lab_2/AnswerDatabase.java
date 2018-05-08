package com.example.ignap.lab_2;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Answer.class , Question.class, Form.class}, version = 1, exportSchema = false)
public abstract class AnswerDatabase extends RoomDatabase {
    public abstract AnswerDao AnswerDao();
}