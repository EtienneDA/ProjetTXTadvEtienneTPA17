package com.example.projettxtadvetiennetpa17;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EscapeActivity extends AppCompatActivity {
    Intent intentretour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escape);
    }

    public void onClickRetour(View view) {
        intentretour = new Intent(EscapeActivity.this, MainActivity.class);
        startActivity(intentretour);
    }
}