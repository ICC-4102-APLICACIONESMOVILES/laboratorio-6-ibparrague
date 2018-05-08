package com.example.ignap.lab_2;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@android.arch.persistence.room.Database(entities = {Form.class,Question.class}, version = 1, exportSchema = false)
public abstract class MyDatabase extends RoomDatabase {
    public abstract DaoAccess daoAccess() ;
    public abstract QuestionDao questionDao();
}

