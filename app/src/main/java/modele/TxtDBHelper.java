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
    public static final String INSERT_2 = "INSERT INTO content (_id, story, choixg, choixd) VALUES ('2', '"+con.story2+"', '"+con.choixg2+"', '"+con.choixd2+"')";
    public static final String INSERT_3 = "INSERT INTO content (_id, story, choixg, choixd) VALUES ('3', '"+con.story3+"', '"+con.choixg3+"', '"+con.choixd3+"')";
    public static final String INSERT_4 = "INSERT INTO content (_id, story, choixg, choixd) VALUES ('4', '"+con.story4+"', '"+con.choixg4+"', '"+con.choixd4+"')";
    public static final String INSERT_5 = "INSERT INTO content (_id, story, choixg, choixd) VALUES ('5', '"+con.story5+"', '"+con.choixg5+"', '"+con.choixd5+"')";
    public static final String INSERT_6 = "INSERT INTO content (_id, story, choixg, choixd) VALUES ('6', '"+con.story6+"', '"+con.choixg6+"', '"+con.choixd6+"')";
    public static final String INSERT_7 = "INSERT INTO content (_id, story, choixg, choixd) VALUES ('7', '"+con.story7+"', '"+con.choixg7+"', '"+con.choixd7+"')";
    public static final String INSERT_8 = "INSERT INTO content (_id, story, choixg, choixd) VALUES ('8', '"+con.story8+"', '"+con.choixg8+"', '"+con.choixd8+"')";
    public static final String INSERT_9 = "INSERT INTO content (_id, story, choixg, choixd) VALUES ('9', '"+con.story9+"', '"+con.choixg9+"', '"+con.choixd9+"')";
    public static final String INSERT_10 = "INSERT INTO content (_id, story, choixg, choixd) VALUES ('10', '"+con.story10+"', '"+con.choixg10+"', '"+con.choixd10+"')";
    public static final String INSERT_11 = "INSERT INTO content (_id, story, choixg, choixd) VALUES ('11', '"+con.story11+"', '"+con.choixg11+"', '"+con.choixd11+"')";
    public static final String INSERT_12 = "INSERT INTO content (_id, story, choixg, choixd) VALUES ('12', '"+con.story12+"', '"+con.choixg12+"', '"+con.choixd12+"')";
    public static final String INSERT_13 = "INSERT INTO content (_id, story, choixg, choixd) VALUES ('13', '"+con.story13+"', '"+con.choixg13+"', '"+con.choixd13+"')";
    public static final String INSERT_14 = "INSERT INTO content (_id, story, choixg, choixd) VALUES ('14', '"+con.story14+"', '"+con.choixg14+"', '"+con.choixd14+"')";
    public static final String INSERT_15 = "INSERT INTO content (_id, story, choixg, choixd) VALUES ('15', '"+con.story15+"', '"+con.choixg15+"', '"+con.choixd15+"')";
    public TxtDBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL(CONTENT_DDL);
    db.execSQL(INSERT_1);
        db.execSQL(INSERT_2);
        db.execSQL(INSERT_3);
        db.execSQL(INSERT_4);
        db.execSQL(INSERT_5);
        db.execSQL(INSERT_6);
        db.execSQL(INSERT_7);
        db.execSQL(INSERT_8);
        db.execSQL(INSERT_9);
        db.execSQL(INSERT_10);
        db.execSQL(INSERT_11);
        db.execSQL(INSERT_12);
        db.execSQL(INSERT_13);
        db.execSQL(INSERT_14);
        db.execSQL(INSERT_15);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_1);
        onCreate(db);
    }

}
