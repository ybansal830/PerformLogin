package com.myfirst.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {

    private TextView mTvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        mTvShow = findViewById(R.id.tvShow);
        String emailShow = getIntent().getStringExtra("eml");
        mTvShow.setText(emailShow);
    }
}