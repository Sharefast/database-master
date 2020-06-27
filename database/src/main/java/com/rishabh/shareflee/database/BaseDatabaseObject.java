package com.rishabh.shareflee.database;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

public interface BaseDatabaseObject
{
    ContentValues getValues();

    SQLQuery.Select getWhere();

    void reconstruct(SQLiteDatabase db, KuickDb kuick, ContentValues item);
}
