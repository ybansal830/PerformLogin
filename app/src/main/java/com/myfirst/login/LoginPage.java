package com.myfirst.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {

    private TextView mTvEmail;
    private TextView mTvPass;
    private Button mBtLog;

    private final String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        mTvEmail = findViewById(R.id.etEmail);
        mTvPass = findViewById(R.id.etPass);
        mBtLog = findViewById(R.id.btLog);
        mBtLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = mTvEmail.getText().toString();
                String pass = mTvPass.getText().toString();
                if(email.matches(emailPattern) && pass.length() >= 6) {
                    Intent intent = new Intent(LoginPage.this, HomePage.class);
                    intent.putExtra("eml", email);
                    startActivity(intent);
                }
                else
                    Toast.makeText(LoginPage.this,"Wrong Credentials",Toast.LENGTH_SHORT).show();
            }
        });
    }
}