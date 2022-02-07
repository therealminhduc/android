package com.example.cyclevie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView);
        Log.i("onCreate()","onCreate");
        tv.setText("onCreate()\n");
    }

    @Override
    protected void onStart(){
        super.onStart();
        tv.append("onStart()\n");
        Log.i("onStart()", "onStart()");
    }

    protected void onPause(){
        super.onPause();
        tv.append("onPause()\n");
        Log.i("onPause()", "onPause()");
        if(isFinishing()){
            tv.append("... fin");
            Log.i("fin", "FINI");
        }
        else{
            tv.append("... continue");
            Log.i("continue", "CONTINUE");
        }
    }

    protected void onRestart() {
        super.onRestart();
        tv.append("onRestart()\n");
        Log.i("onRestart()", "onRestart()");
    }

    protected void onStop(){
        super.onStop();
        tv.append("onStop()\n");
        Log.i("onStop()", "onStop()");
    }

    protected void onDestroy(){
        super.onDestroy();
        tv.append("onDestroy()\n");
        Log.i("onDestroy()", "onDestroy()");
    }

}