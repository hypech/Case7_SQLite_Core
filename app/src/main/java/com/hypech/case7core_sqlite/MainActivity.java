package com.hypech.case7core_sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void myClick(View view){
        DBOpenHelper mDBOpenHelper = new DBOpenHelper(this);
        mDBOpenHelper.add("hypech", "pwd", "hypech.com@gmail.com", "777-777-7777");
    }
}