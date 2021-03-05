package com.example.mobileapplabexcercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class newactivity extends AppCompatActivity {
//    public static final String EXTRA_MESSAGE = "com.example.mobileapplabexcercise.extra.MESSAGE";
     TextView txt_showcount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newactivity);
        txt_showcount =findViewById(R.id.txt_showcount);
        Intent intent = getIntent();
        String str = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        txt_showcount.setText(str);
    }

}