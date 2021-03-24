package com.example.buttonapp;

import android.view.View;
import android.widget.TextView;

public class MyOnClickListener implements View.OnClickListener {
    MainActivity mainActivity;
    public MyOnClickListener(MainActivity mainActivity) {
    this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {
    mainActivity.mtextView1.setText("버튼클릭 확인");
    }
}
