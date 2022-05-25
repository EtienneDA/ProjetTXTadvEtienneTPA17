package modele;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class TxtDBHelper extends SQLiteOpenHelper {

    private static content con = new content();

    //CONSTANTES
    public static final String TABLE_1 = "content";
    public static final String COL_ID = "_id";
    public static final String COL_STORY = "story";
    public static final String COL_CHOIXG = "choixg";
    public static final String COL_CHOIXD = "choixd";
    public static final String BD_NAME = "txtadv";
    public static final int VERSION = 1;
    //ddl
    public static final String CONTENT_DDL =
            "create table " + TABLE_1 + "(" + COL_ID + " integer primary key, " +
                    COL_STORY + " TEXT, " +
                    COL_CHOIXG + " TEXT, " +
                    COL_CHOIXD + " TEXT)";
    public static final String INSERT_1 = "INSERT INTO content (_id, story, choixg, choixd) VALUES ('1', '"+con.story1+"', '"+con.choixg1+"', '"+con.choixd1+"')";

    public TxtDBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL(CONTENT_DDL);
    db.execSQL(INSERT_1);
    //ContentValues values1 = new ContentValues();
    //values1.put(COL_ID, 1);
    //values1.put(COL_STORY, con.story1);
    //values1.put(COL_CHOIXG, con.choixg1);
    //values1.put(COL_CHOIXD, con.choixd1);
    //db.insert(TABLE_1, null,values1);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_1);
        onCreate(db);
    }

}
