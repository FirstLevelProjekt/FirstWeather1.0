package com.firstweather.firstweather;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreen);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }

    public void buttonOnClick(View v){
        switch (v.getId()) {
            case R.id.today:
                setContentView(R.layout.homescreen);
                break;

            case R.id.tomorrow:
                //setContentView(R.layout.tomorrow);
                break;

            case R.id.week:
                setContentView(R.layout.week);
                break;

            case R.id.options:
                setContentView(R.layout.option);
                break;

            case R.id.city:
                setContentView(R.layout.city);
                break;

            case R.id.optionsBack:
                setContentView(R.layout.homescreen);
                break;

            case R.id.backArrow:
                setContentView(R.layout.homescreen);
                break;
        }
    }
}

