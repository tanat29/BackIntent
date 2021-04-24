package com.tanat29.backintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Go_to_Main2(View view) {
        Intent tt = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(tt);
    }
}