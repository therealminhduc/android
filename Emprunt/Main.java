package com.example.emprunt;

import static java.lang.Double.*;
import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText capital;
    EditText taux;
    EditText annee;
    Button calculer;

    TextView textView;

    int cap;
    double tau;
    int ann;
    double res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView5);

        capital = findViewById(R.id.capitalInput);
        taux = findViewById(R.id.tauxInput);
        annee = findViewById(R.id.anneeInput);

        cap = parseInt(String.valueOf(capital));
        tau = parseDouble(String.valueOf(taux));
        ann = parseInt(String.valueOf(annee));

        res = (cap*(tau/12)) / (1-pow((1+(tau/12)),-ann));

        calculer = findViewById(R.id.button);
        calculer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.valueOf(res));
            }
        });

    }
}