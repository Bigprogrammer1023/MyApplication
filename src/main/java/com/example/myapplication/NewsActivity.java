package com.example.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.widget.TextView;

/**
 * Created by QPF on 2016/8/15.
 */
public class NewsActivity extends AppCompatActivity
{
    TextView tv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        tv = (TextView)findViewById(R.id.xxxx);
        tv.setText("这是消息");
    }
}
