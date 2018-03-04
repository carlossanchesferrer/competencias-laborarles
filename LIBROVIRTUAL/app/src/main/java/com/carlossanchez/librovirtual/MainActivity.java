    package com.carlossanchez.librovirtual;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

    public class MainActivity extends AppCompatActivity {

        Button btnLeer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLeer =  findViewById(R.id.btnLeer);

        btnLeer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent miIntent = new Intent(MainActivity.this, LecturaLibroActivity.class);
                startActivity(miIntent);



            }
        });


    }
        }



