package com.firstweather.firstweather;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Week extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.week);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.hide();
    }

    public void buttonOnClick(View view) {

        Intent intent;

        switch (view.getId()) {

            case R.id.tomorrow:
                intent = new Intent(Week.this, TomorrowActivity.class);
                startActivity(intent);
                break;

            case R.id.today:
                intent = new Intent(Week.this, HomeActivity.class);
                startActivity(intent);
                break;

            case R.id.options:
                intent = new Intent(Week.this, Option.class);
                startActivity(intent);
                break;

            case R.id.city:
                intent = new Intent(Week.this, City.class );
                startActivity(intent);
                break;

        }
    }

}