package com.example.growsync;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText etEmail = findViewById(R.id.etEmail);
        EditText etPassword = findViewById(R.id.etPassword);
        Spinner spRole = findViewById(R.id.spRole);
        Button btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(v -> {
            String email = etEmail.getText().toString().trim();
            String password = etPassword.getText().toString();
            String role = spRole.getSelectedItem().toString();

            if (email.isEmpty()) {
                etEmail.setError("Email ya Student ID enter karo");
                return;
            }

            if (password.isEmpty()) {
                etPassword.setError("Password enter karo");
                return;
            }

            Toast.makeText(
                    LoginActivity.this,
                    "Login form working! Role: " + role,
                    Toast.LENGTH_SHORT
            ).show();
        });
    }
}