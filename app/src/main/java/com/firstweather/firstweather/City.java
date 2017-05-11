package com.firstweather.firstweather;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class City extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.city);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.hide();
    }

    public void buttonOnClick(View view) {

        Intent intent;

        switch (view.getId()) {

            case R.id.backArrow:
                intent = new Intent(City.this, HomeActivity.class );
                startActivity(intent);
                break;

        }
    }


}