package com.example.fishop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Arwana_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arwana);
    }

    public void check(View view) {
        Intent intent = new Intent(Arwana_activity.this, payment1.class);
        startActivity(intent);
    }
}