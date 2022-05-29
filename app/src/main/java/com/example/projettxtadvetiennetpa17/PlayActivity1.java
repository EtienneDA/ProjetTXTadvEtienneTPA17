package com.example.projettxtadvetiennetpa17;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import modele.ContentM;
import modele.DbAdapter;

public class PlayActivity1 extends AppCompatActivity {
    private TextView txtStory, txtChoixg, txtChoixd;
    private Intent NextAct;
    private DbAdapter dbAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play1);
        dbAdapter = new DbAdapter(PlayActivity1.this);
        setWidgets();
        afficherStory();
    }


    private void setWidgets() {
        txtStory = findViewById(R.id.txtStory);
        txtChoixg = findViewById(R.id.txtChoixG);
        txtChoixd = findViewById(R.id.txtChoixD);

    }

    private void afficherStory() {
        Intent input = getIntent();
        int progres = input.getIntExtra("progress", 0);
        ContentM con = dbAdapter.findStory(progres);
            txtStory.setText(con.getStory());
            txtChoixg.setText(con.getChoixg());
            txtChoixd.setText(con.getChoixd());
    }

    public void onClickG(View view) {
        Intent input = getIntent();
        int progres = input.getIntExtra("progress", 0);
        int progress = 0;
        if (progres == 1) {
            progress = 3;
            NextAct = new Intent(PlayActivity1.this, PlayActivity2.class);
        }
        else if (progres == 5 || progres == 14){
            progress =6;
            NextAct = new Intent(PlayActivity1.this, PlayActivity2.class);
        }
        else if (progres == 6 || progres == 9 || progres == 12 || progres == 13){
            progress = 7;
            NextAct = new Intent(PlayActivity1.this, EscapeActivity.class);
        }
        else if (progres == 10) {
            progress = 11;
            NextAct = new Intent(PlayActivity1.this, PlayActivity2.class);
        }
        else if (progres == 11) {
            progress = 13;
            NextAct = new Intent(PlayActivity1.this, PlayActivity2.class);
        }
        else {
            NextAct = new Intent(PlayActivity1.this, MainActivity.class);
        }
        NextAct.putExtra("progress", progress);
        startActivity(NextAct);
    }

    public void onClickD(View view) {
        Intent input = getIntent();
        int progres = input.getIntExtra("progress", 0);
        int progress = 0;
        if (progres == 1) {
            progress = 2;
            NextAct = new Intent(PlayActivity1.this, PlayActivity2.class);
        }
        else if (progres == 5 || progres == 14){
            progress =9;
            NextAct = new Intent(PlayActivity1.this, PlayActivity2.class);
        }
        else if (progres == 6 || progres == 9){
            progress = 8;
            NextAct = new Intent(PlayActivity1.this, EscapeActivity.class);
        }
        else if (progres == 10) {
            progress = 11;
            NextAct = new Intent(PlayActivity1.this, PlayActivity2.class);
        }
        else if (progres == 11) {
            progress = 12;
            NextAct = new Intent(PlayActivity1.this, PlayActivity2.class);
        }
        else if (progres == 12 || progres == 13) {
            progress = 15;
            NextAct = new Intent(PlayActivity1.this, DeadActivity.class);
        }
        NextAct.putExtra("progress", progress);
        startActivity(NextAct);
    }
}