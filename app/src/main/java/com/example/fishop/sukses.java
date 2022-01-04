package com.example.fishop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sukses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sukses);
    }
    public void kembali(View view) {
        Intent intent = new Intent(sukses.this,Home.class);
        startActivity(intent);
    }
}