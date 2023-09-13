package com.example.loginform01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUsername, editTextPassword;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginFn();
            }
        });
    }

    private void loginFn(){
        String username = editTextUsername.getText().toString();
        String password = editTextPassword.getText().toString();


        if (username.equals("Moditha") && password.equals("abcd")) {

            Intent intent = new Intent(this,LoginForm.class);
            intent.putExtra("LoginMessage","Succesfully Login!!!");
            startActivity(intent);
            //Toast.makeText(MainActivity.this, "Login successful", Toast.LENGTH_SHORT).show();
        } else {

            Toast.makeText(MainActivity.this, "Login failed", Toast.LENGTH_SHORT).show();
        }
    }
}
