package com.example.nguyentanvinh_59133157_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView the_time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle", "onCreate  Called");
        the_time = findViewById(R.id.the_time);
        SimpleDateFormat spF = new SimpleDateFormat("HH:mm:ss");
        Toast.makeText(getApplicationContext(), "onCreate Called", Toast.LENGTH_SHORT).show();
        String date =spF. format(new Date());
        the_time.setText(date);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle", "onStart  Called");
        Toast.makeText(getApplicationContext(), "onStart Called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle", "onResume  Called");
        Toast.makeText(getApplicationContext(), "onResume Called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle", "onPause  Called");
        Toast.makeText(getApplicationContext(), "onPause Called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle", "onStop  Called");
        Toast.makeText(getApplicationContext(), "onStop Called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle", "onRestart  Called");
        Toast.makeText(getApplicationContext(), "onRestart Called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle", "onDestroy  Called");
        Toast.makeText(getApplicationContext(), "onDestroy Called", Toast.LENGTH_SHORT).show();
    }
}

