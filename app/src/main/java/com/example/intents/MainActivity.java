package com.example.intents;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.sql.Time;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button syncBtn = findViewById(R.id.sync_btn);
        syncBtn.setOnClickListener(view -> {

            Intent intent = new Intent(Intent.ACTION_SYNC);
            int time = LocalTime.now().getHour();
            if(6 <= time && time < 14) {
                intent.setData(Uri.parse("http://morning"));
            } else if(time == 14) {
                intent.setData(Uri.parse("http://afternoon"));
            } else {
                intent.setData(Uri.parse("http://evening"));
            }

            startActivity(intent);
        });
    }
}