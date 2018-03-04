package com.carlossanchez.librovirtual;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LecturaLibroActivity extends AppCompatActivity {

    Button btnContinue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lectura_libro);
        btnContinue= findViewById(R.id.btnContinue);

        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent elIntent=new Intent(LecturaLibroActivity.this,tema1Activity.class);
                startActivity(elIntent);
            }
        });
    }
}
