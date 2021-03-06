package com.deni.basketball.recordtrain;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/**
 * Created by deni on 2018/1/17.
 */

public class KeyMsgReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("RecordReceiver","onReceive");

        RecordDBHelper dbHelper= new RecordDBHelper(context);

        SQLiteDatabase db = dbHelper.getWritableDatabase();
        db.beginTransaction();

        db.execSQL("insert into " + RecordDBHelper.TABLE_NAME + " (Happy) values (1)");

        db.setTransactionSuccessful();
        db.endTransaction();
        db.close();
    }
}
