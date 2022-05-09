package com.example.projettxtadvetiennetpa17;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DeadActivity extends AppCompatActivity {
    Intent intentretour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dead);
    }

    public void onClickRetour(View view) {
        intentretour = new Intent(DeadActivity.this, MainActivity.class);
        startActivity(intentretour);
    }
}