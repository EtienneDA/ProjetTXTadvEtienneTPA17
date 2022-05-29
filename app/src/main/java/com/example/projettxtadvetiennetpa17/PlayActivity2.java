package com.example.projettxtadvetiennetpa17;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import modele.ContentM;
import modele.DbAdapter;

public class PlayActivity2 extends AppCompatActivity {
    private TextView txtStory2, txtChoixg2, txtChoixd2;
    private Intent NextAct;
    private DbAdapter dbAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play2);
        dbAdapter = new DbAdapter(PlayActivity2.this);
        setWidgets();
        afficherStory();
    }

    private void setWidgets() {
        txtStory2 = findViewById(R.id.txtStory2);
        txtChoixg2 = findViewById(R.id.txtChoixG2);
        txtChoixd2 = findViewById(R.id.txtChoixD2);

    }

    private void afficherStory() {
        Intent input = getIntent();
        int progres = input.getIntExtra("progress", 0);
        ContentM con = dbAdapter.findStory(progres);
        txtStory2.setText(con.getStory());
        txtChoixg2.setText(con.getChoixg());
        txtChoixd2.setText(con.getChoixd());
    }

    public void onClickG(View view) {
        Intent input = getIntent();
        int progres = input.getIntExtra("progress", 0);
        int progress = 0;
        if (progres == 2) {
            progress = 5;
            NextAct = new Intent(PlayActivity2.this, PlayActivity1.class);
        }
        else if (progres == 3){
            progress =10;
            NextAct = new Intent(PlayActivity2.this, PlayActivity1.class);
        }
        else if (progres == 5 || progres == 14){
            progress = 6;
            NextAct = new Intent(PlayActivity2.this, PlayActivity1.class);
        }
        else if (progres == 6 || progres == 9 || progres == 12 || progres == 13) {
            progress = 7;
            NextAct = new Intent(PlayActivity2.this, EscapeActivity.class);
        }
        else if (progres == 10) {
            progress = 11;
            NextAct = new Intent(PlayActivity2.this, PlayActivity1.class);
        }
        else if (progres == 11) {
            progress = 13;
            NextAct = new Intent(PlayActivity2.this, PlayActivity1.class);
        }
        else {
            NextAct = new Intent(PlayActivity2.this, MainActivity.class);
        }
        NextAct.putExtra("progress", progress);
        startActivity(NextAct);
    }

    public void onClickD(View view) {
        Intent input = getIntent();
        int progres = input.getIntExtra("progress", 0);
        int progress = 0;
        if (progres == 2) {
            progress = 4;
            NextAct = new Intent(PlayActivity2.this, DeadActivity.class);
        }
        else if (progres == 3){
            progress =10;
            NextAct = new Intent(PlayActivity2.this, PlayActivity1.class);
        }
        else if (progres == 5 || progres == 14){
            progress = 9;
            NextAct = new Intent(PlayActivity2.this, EscapeActivity.class);
        }
        else if (progres == 6 || progres == 9) {
            progress = 8;
            NextAct = new Intent(PlayActivity2.this, EscapeActivity.class);
        }
        else if (progres == 10) {
            progress = 11;
            NextAct = new Intent(PlayActivity2.this, PlayActivity1.class);
        }
        else if (progres == 11) {
            progress = 12;
            NextAct = new Intent(PlayActivity2.this, PlayActivity1.class);
        }
        else if (progres == 12 || progres == 13) {
            progress = 15;
            NextAct = new Intent(PlayActivity2.this, DeadActivity.class);
        }
        NextAct.putExtra("progress", progress);
        startActivity(NextAct);
    }
}