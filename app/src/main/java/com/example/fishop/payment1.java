package com.example.fishop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class payment1 extends AppCompatActivity{
EditText et1, et2, et3;
RadioButton rb1, rb2, rb3, rb4, rb5, rb6;
RadioGroup rb, rbb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment1);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        rb = findViewById(R.id.rb);
        rbb = findViewById(R.id.rbb);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        rb4 = findViewById(R.id.rb4);
        rb5 = findViewById(R.id.rb5);
        rb6 = findViewById(R.id.rb6);




    }


    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.rb1:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.rb2:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.rb3:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.rb4:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.rb5:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.rb6:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }
    public void cekout(View view) {
        int idradio = rb.getCheckedRadioButtonId()
    }
}