package com.rishabh.shareflee.database;

import android.database.sqlite.SQLiteDatabase;

/**
 * created by: Veli
 * date: 2.11.2017 21:31
 */

public interface DatabaseObject<T> extends BaseDatabaseObject
{
	void onCreateObject(SQLiteDatabase db, KuickDb kuick, T parent, Progress.Listener listener);

	void onUpdateObject(SQLiteDatabase db, KuickDb kuick, T parent, Progress.Listener listener);

	void onRemoveObject(SQLiteDatabase db, KuickDb kuick, T parent, Progress.Listener listener);
}
