package com.example.projettxtadvetiennetpa17;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import modele.ContentM;
import modele.DbAdapter;

public class PlayActivity1 extends AppCompatActivity {
    private TextView txtStory, txtChoixg, txtChoixd;
    private Intent Play2;
    private int progress = 1;
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
        ContentM con = dbAdapter.findStory(progress);
        txtStory.setText(con.getStory());
        txtChoixg.setText(con.getChoixg());
        txtChoixd.setText(con.getChoixd());
    }

    public void onClickG(View view) {
        Play2 = new Intent(PlayActivity1.this, PlayActivity2.class);
        startActivity(Play2);
    }

    public void onClickD(View view) {
        Play2 = new Intent(PlayActivity1.this, PlayActivity2.class);
        startActivity(Play2);
    }
}