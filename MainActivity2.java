package com.example.loginform01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LoginForm extends AppCompatActivity {

    private TextView myMessage ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);

        myMessage = (TextView) findViewById(R.id.Login_Message);

        //Retrieve the message from the intent
        Intent intent = getIntent();
        if(intent != null && intent.hasExtra("LoginMessage")) {
            String loginMsg = intent.getStringExtra("LoginMessage");
            myMessage.setText(loginMsg);
        }

    }
}
