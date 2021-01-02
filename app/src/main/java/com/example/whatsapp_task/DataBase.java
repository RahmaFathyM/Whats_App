package com.example.whatsapp_task;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DataBase  extends SQLiteOpenHelper {

    public static final String DB_Name = "chat_db";
    public static final int DB_Version = 7;
    public static final String tb_name = "Chat";
    public static final String CLN_NAME = "name";
    public static final String CLN_MESSAGE = "message";
    public static final String CLN_IMAGE = "image";
    public DataBase(@Nullable Context context) {
        super(context, DB_Name, null,DB_Version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(" CREATE TABLE " + tb_name + " ( " + CLN_NAME + " TEXT UNIQUE , " + CLN_MESSAGE + " TEXT , " + CLN_IMAGE + " INTEGER ) " );

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + tb_name);
        onCreate(db);
    }
    public void insertItem(ChatItem chatItem) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(CLN_NAME, chatItem.getNanme());
        values.put(CLN_MESSAGE, chatItem.getMessage());
        values.put(CLN_IMAGE,chatItem.getImage());
        db.insert( tb_name ,null, values);

    }
    public ArrayList<ChatItem> getAllChats() {
        ArrayList<ChatItem> arrayList = new ArrayList<ChatItem>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + tb_name, null);
        if (cursor != null && cursor.moveToFirst()) {
            do {
                String name = cursor.getString(cursor.getColumnIndex(CLN_NAME));
                String message = cursor.getString(cursor.getColumnIndex(CLN_MESSAGE));
                int image =cursor.getInt(cursor.getColumnIndex(CLN_IMAGE));
               ChatItem chatItem = new ChatItem(name,message,image);
               arrayList.add(chatItem);

            } while (cursor.moveToNext());
            cursor.close();
        }
        return arrayList;
    }
}
