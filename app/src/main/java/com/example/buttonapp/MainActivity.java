package com.example.buttonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mtextView1;
    Button mbutton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtextView1 = (TextView)findViewById(R.id.textView1);
        mbutton1 = (Button)findViewById(R.id.button1);
        mbutton1.setOnClickListener(new MyOnClickListener(this));
    }


    }
