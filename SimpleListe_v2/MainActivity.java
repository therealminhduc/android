package com.example.simpleliste;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] data = new String[]{"Réseaux","Mathématiques","Probabilités Statistiques","Gestion de Projet","Prorammation objet","Anglais","Droit","Expression communication","Stage"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listview);
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String matiere = adapterView.getItemAtPosition(i).toString();
                Intent intent = new Intent(Intent.ACTION_VIEW);
                Toast.makeText(MainActivity.this, "Vous avez choisi : "+matiere, Toast.LENGTH_LONG).show();
            }
        });
    }
}