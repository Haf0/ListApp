package com.belajar.listapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSimple = (Button) findViewById(R.id.btnSimple);
        btnSimple.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Class<?> actionClass = null;
        if(v.getId() == R.id.btnSimple){
            actionClass = SimpleListActivity.class;
        }
        Intent menuIntent = new Intent(MainActivity.this, actionClass);
        startActivity(menuIntent);
    }
}