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
    private Intent input;
    private DbAdapter dbAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play1);
        dbAdapter = new DbAdapter(PlayActivity1.this);
        input = getIntent();
        setWidgets();
        afficherStory();
    }


    private void setWidgets() {
        txtStory = findViewById(R.id.txtStory);
        txtChoixg = findViewById(R.id.txtChoixG);
        txtChoixd = findViewById(R.id.txtChoixD);

    }

    private void afficherStory() {
        int progres = input.getIntExtra("progress", 0);
        ContentM con = dbAdapter.findStory(progres);
            txtStory.setText(con.getStory());
            txtChoixg.setText(con.getChoixg());
            txtChoixd.setText(con.getChoixd());
    }

    public void onClickG(View view) {

        int progres = input.getIntExtra("progress", 0);
        int progress = 0;
        if (progres == 1) {
            progress = 3;
            NextAct = new Intent(PlayActivity1.this, PlayActivity2.class);
        }
        else if (progres == 2){
            progress =4;
            NextAct = new Intent(PlayActivity1.this, PlayActivity2.class);
        }
        else if (progres == 3){

        }
        NextAct.putExtra("progress", progress);
        startActivity(NextAct);
    }

    public void onClickD(View view) {
        NextAct = new Intent(PlayActivity1.this, PlayActivity2.class);
        startActivity(NextAct);
    }
}