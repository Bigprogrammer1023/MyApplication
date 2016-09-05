package com.example.myapplication;

import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

public class MainActivity extends TabActivity {

    TabHost tab;
    ImageView image;
    TextView txv;
    TextView txtv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tab = getTabHost();
        tab.addTab(tab.newTabSpec("home").setIndicator(onCreateView(7,"首页",R.drawable.home_selected)).setContent(new Intent(MainActivity.this,HomeActivity.class)));
        tab.addTab(tab.newTabSpec("news").setIndicator(onCreateView(4,"消息",R.drawable.news_selected)).setContent(new Intent(MainActivity.this,NewsActivity.class)));
        tab.addTab(tab.newTabSpec("find").setIndicator(onCreateView(0,"发现",R.drawable.find_selected)).setContent(new Intent(MainActivity.this,FindActivity.class)));
        tab.addTab(tab.newTabSpec("me").setIndicator(onCreateView(0,"我",R.drawable.me_selected)).setContent(new Intent(MainActivity.this,MeActivity.class)));
    }
    public View onCreateView(int n,String s,int res)
    {
        LayoutInflater la = getLayoutInflater();
        View v = la.inflate(R.layout.activity_title,null);
        image = (ImageView)v.findViewById(R.id.iv1);
        image.setImageResource(res);
        txv = (TextView)v.findViewById(R.id.tv1);
        txv.setText(s);
        txtv = (TextView)v.findViewById(R.id.tv2);
        if (n == 0)
        {
            txtv.setVisibility(View.GONE);
        }
        else {
            txtv.setText(n + "");
        }
        return v;
    }
}
