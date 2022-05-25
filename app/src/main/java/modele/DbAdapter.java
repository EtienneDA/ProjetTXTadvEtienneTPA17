package modele;

import static modele.TxtDBHelper.*;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class DbAdapter {
    private SQLiteDatabase db;
    private TxtDBHelper dbHelper;


    public DbAdapter(Context context) {
        this.dbHelper = new TxtDBHelper(context, TxtDBHelper.BD_NAME, null, TxtDBHelper.VERSION);
    }

    public void openBd() {
        db = dbHelper.getWritableDatabase();
    }

    public void fermerBd() {
        db.close();
    }

    public ContentM findStory(int id) {
        openBd();
        db = dbHelper.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_1 + " WHERE " + COL_ID + "=" + id, null, null);
        cursor.moveToFirst();
        ContentM con = new ContentM();
        con.set_id(id);
        con.setStory(cursor.getString(cursor.getColumnIndexOrThrow(COL_STORY)));
        con.setChoixg(cursor.getString(cursor.getColumnIndexOrThrow(COL_CHOIXG)));
        con.setChoixd(cursor.getString(cursor.getColumnIndexOrThrow(COL_CHOIXD)));
        cursor.close();
        fermerBd();
        return con;
    }
}
