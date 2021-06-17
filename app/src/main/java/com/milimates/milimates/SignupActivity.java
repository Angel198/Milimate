package com.milimates.milimates;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {

    EditText email, password, name, confirm_pass;
    TextView complete, click_here;
    LinearLayout signup_google;
    String _email, _pass, _name, _confirmpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        name = (EditText) findViewById(R.id.name);
        confirm_pass = (EditText) findViewById(R.id.confirm_pass);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.pass);
        complete = (TextView) findViewById(R.id.text_complete);
        signup_google = (LinearLayout) findViewById(R.id.google_signup);
        click_here = (TextView) findViewById(R.id.click_here);


        complete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _name = name.getText().toString();
                _email = email.getText().toString();
                _pass = password.getText().toString();
                _confirmpass = confirm_pass.getText().toString();
            }
        });

        click_here.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignupActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });

    }
}