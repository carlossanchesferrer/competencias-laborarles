package com.carlossanchez.librovirtual;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tema1Activity extends AppCompatActivity {

    Button btnContinue2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tema1);


        btnContinue2=findViewById(R.id.btnContinue2);


        btnContinue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent E = new Intent(tema1Activity.this,tema2Activity.class);
                startActivity(E);
            }
        });



    }
}
