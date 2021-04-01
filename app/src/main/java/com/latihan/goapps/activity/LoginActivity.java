package com.latihan.goapps.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.latihan.goapps.R;

public class LoginActivity extends AppCompatActivity {

    EditText etUsername, etPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_relative);


        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(view -> {
            if (etPassword.getText().toString().toUpperCase().equals("TEST1")) {
                login_sukses();
            }else {
                Toast.makeText(getApplicationContext(), "Password Wrong", Toast.LENGTH_SHORT).show();
            }

        });


    }

    private void login_sukses() {
        String user_login = etUsername.getText().toString();
        Intent i = new Intent(this,MainActivity.class);

        //kirimkan username ke tampilan utama
        i.putExtra("USERNAME", "romizzidiamly");
        startActivity(i);
    }

}