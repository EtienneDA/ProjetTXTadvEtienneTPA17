package modele;

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

    public List<String> findStory(int _id) {
        openBd();
        db = dbHelper.getReadableDatabase();
        Cursor cursorS = db.rawQuery("SELECT story, choixg, choixd FROM content WHERE _id = "+_id, null);
        List<String> storys = new ArrayList<String>();
        storys.add(cursorS.getString(0));
        storys.add(cursorS.getString(1));
        storys.add(cursorS.getString(2));
        fermerBd();
        return storys;
    }
}
