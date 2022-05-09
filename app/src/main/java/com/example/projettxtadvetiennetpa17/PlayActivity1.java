package com.example.projettxtadvetiennetpa17;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PlayActivity1 extends AppCompatActivity {
    private Intent Play2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play1);
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