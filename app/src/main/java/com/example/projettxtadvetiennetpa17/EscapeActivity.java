package com.example.projettxtadvetiennetpa17;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import modele.ContentM;
import modele.DbAdapter;

public class EscapeActivity extends AppCompatActivity {
    private TextView txtStory;
    Intent intentretour;
    private DbAdapter dbAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escape);
        dbAdapter = new DbAdapter(EscapeActivity.this);
        setWidgets();
        afficherStory();
    }

    private void setWidgets() {
        txtStory = findViewById(R.id.txtStory4);
    }

    private void afficherStory() {
        Intent input = getIntent();
        int progres = input.getIntExtra("progress", 0);
        ContentM con = dbAdapter.findStory(progres);
        txtStory.setText(con.getStory());
    }

    public void onClickRetour(View view) {
        intentretour = new Intent(EscapeActivity.this, MainActivity.class);
        startActivity(intentretour);
    }
}