package com.example.aula4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    TextView resultText;
    EditText input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Click(View view){
        input = findViewById(R.id.inputConvert);
        resultText = findViewById(R.id.resultxt);
        double convert = 449.83 * Double.parseDouble(input.getText().toString());
        resultText.setText(String.valueOf(convert));
    }
}