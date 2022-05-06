package com.example.project;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    TextView textView;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        editText = findViewById(R.id.secondEditText);
        button = findViewById(R.id.editButton);
        sharedPreferences = getSharedPreferences("SharedPreferences", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editor = sharedPreferences.edit();
                editor.putString("textInput", editText.getText().toString());
                editor.apply();
            }
        });
    }
}
