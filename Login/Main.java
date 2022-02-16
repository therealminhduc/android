package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText usernameText;
    EditText passwordText;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameText = findViewById(R.id.editname_text);
        passwordText = findViewById(R.id.password_text);
        loginButton = findViewById(R.id.button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (usernameText.getText().length() > 0 && passwordText.getText().length() > 0) {
                    String toast = "Le login est : " + usernameText.getText().toString() + " et le mdp est : " + passwordText.getText().toString();
                    Toast.makeText(MainActivity.this, toast, Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    Toast.makeText(MainActivity.this, "rien mis", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

