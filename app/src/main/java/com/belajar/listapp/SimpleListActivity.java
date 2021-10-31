package com.belajar.listapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SimpleListActivity extends AppCompatActivity {

    private ListView lvItem;
    private String[] fruits = new String[]{
            "Banana", "Apple", "Orange", "Pineapple", "Mango",
            "Grapes", "Watermelon", "Avocado", "Lemon", "Cherry",
            "Guava", "Kiwi", "Jackfruit", "Papaya", "Pear", "Peach",
            "Strawberry", "Plum", "Starfruit"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list);

        lvItem = (ListView) findViewById(R.id.lvSimple);
        ArrayAdapter<String> simpleAdapter = new ArrayAdapter<String>(SimpleListActivity.this,
                android.R.layout.simple_list_item_1, android.R.id.text1, fruits);

        lvItem.setAdapter(simpleAdapter);

    }
}