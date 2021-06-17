package com.milimates.milimates;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    EditText email, password;
    TextView complete, click_here;
    LinearLayout signin_google;
    String _email, _pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.pass);
        complete = (TextView) findViewById(R.id.text_complete);
        click_here = (TextView) findViewById(R.id.click_here);

        signin_google = (LinearLayout) findViewById(R.id.google_signin);


        complete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _email = email.getText().toString();
                _pass = password.getText().toString();
            }
        });

        click_here.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,SignupActivity.class);
                startActivity(intent);
            }
        });
    }
}