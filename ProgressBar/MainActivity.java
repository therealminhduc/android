package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ProgressBar progressBar;
    int i = 0;
    TextView textView;
    Handler handler = new Handler();
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressBar);
        textView = findViewById(R.id.textView);

        button = findViewById(R.id.buttonStart);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = progressBar.getProgress();
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (i<100){
                            i = i+1;
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    progressBar.setProgress(i);
                                    textView.setText(i+"/"+progressBar.getMax());
                                }
                            });
                            try {
                                Thread.sleep(100);
                            }
                            catch (InterruptedException e){
                                e.printStackTrace();
                            }
                        }
                    }
                }).start();
            }
        });
    }
}