package com.example.intents;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.time.LocalTime;

public class AfternoonActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afternoon);

        TextView view = findViewById(R.id.afternoon_time);
        LocalTime time = LocalTime.now();
        view.setText(String.valueOf(time));
    }
}