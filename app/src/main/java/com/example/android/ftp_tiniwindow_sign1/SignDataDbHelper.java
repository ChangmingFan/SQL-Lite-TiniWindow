package com.example.android.ftp_tiniwindow_sign1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class SignDataDbHelper extends SQLiteOpenHelper {

    // The database name
    private static final String DATABASE_NAME = "signdata.db";

    // If you change the database schema, you must increment the database version
    private static final int DATABASE_VERSION = 1;

    // Constructor
    public SignDataDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        // Create a table to hold waitlist data
        final String SQL_CREATE_SIGNDATA_TABLE = "CREATE TABLE " + SignDataContract.SignData.TABLE_NAME + " (" +
                SignDataContract.SignData._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                SignDataContract.SignData.COLUMN_SEASON + " TEXT NOT NULL, " +
                SignDataContract.SignData.COLUMN_LINE_LENGTH + " INTEGER NOT NULL, " +
                SignDataContract.SignData.COLUMN_LINE_COUNT + " INTEGER NOT NULL, " +
                SignDataContract.SignData.COLUMN_SPEED+ " INTEGER NOT NULL" +
                "); ";

        sqLiteDatabase.execSQL(SQL_CREATE_SIGNDATA_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        // For now simply drop the table and create a new one. This means if you change the
        // DATABASE_VERSION the table will be dropped.
        // In a production app, this method might be modified to ALTER the table
        // instead of dropping it, so that existing data is not deleted.
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + SignDataContract.SignData.TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
}
