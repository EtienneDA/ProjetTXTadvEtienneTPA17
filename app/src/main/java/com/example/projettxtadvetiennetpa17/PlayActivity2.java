package com.example.projettxtadvetiennetpa17;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PlayActivity2 extends AppCompatActivity {
    private Intent dead;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play2);
    }

    public void onClickG(View view) {
        dead = new Intent (PlayActivity2.this, DeadActivity.class);
    }

    public void onClickD(View view) {
        dead = new Intent (PlayActivity2.this, DeadActivity.class);
    }
}