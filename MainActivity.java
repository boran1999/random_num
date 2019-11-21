package com.example.random_num;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText min;
    EditText max;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        min = findViewById(R.id.number1);
        max = findViewById(R.id.number2);
    }

    public void onClick(View v) {
        Intent i = new Intent(this, FilmActivity.class);
        i.putExtra("min", Integer.parseInt(min.getText().toString()));
        i.putExtra("max", Integer.parseInt(max.getText().toString()));
        startActivity(i);
    }
}
