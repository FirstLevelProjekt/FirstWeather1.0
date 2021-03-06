package com.firstweather.firstweather;

import android.content.Intent;
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
        assert actionBar != null;
        actionBar.hide();
    }


    public void buttonOnClick(View view) {

        Intent intent;

        switch (view.getId()) {

            case R.id.tomorrow:
                intent = new Intent(HomeActivity.this, TomorrowActivity.class);
                startActivity(intent);
                break;

            case R.id.week:
                intent = new Intent(HomeActivity.this, Week.class);
                startActivity(intent);
                break;

            case R.id.options:
                intent = new Intent(HomeActivity.this, Option.class);
                startActivity(intent);
                break;

            case R.id.city:
                intent = new Intent(HomeActivity.this, City.class );
                startActivity(intent);
                break;

        }
    }

}

