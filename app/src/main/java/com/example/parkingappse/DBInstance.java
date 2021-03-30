package com.example.parkingappse;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

public class DBInstance
{
    RoomDatabase.Builder<AppDatabase> db;
    private AppDatabase appDatabase;
    private Context mCtx;
    private static DBInstance mInstance;

    private DBInstance(Context mCtx) {
        this.mCtx = mCtx;
        db= Room.databaseBuilder(mCtx,AppDatabase.class,"User.db");
        //creating the app database with Room database builder
        //MyToDos is the name of the database
        appDatabase=db.allowMainThreadQueries().fallbackToDestructiveMigration().build();
    }

    public static DBInstance getInstance(Context mCtx) {
        if (mInstance == null) {
            mInstance = new DBInstance(mCtx);
        }
        return mInstance;
    }

    public AppDatabase getAppDatabase() {
        return appDatabase;
    }
}

