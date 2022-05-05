package com.example.project;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    TextView secondTextView;

    protected void onCreate(){
        secondTextView = findViewById(R.id.secondTextView);
    }
}
