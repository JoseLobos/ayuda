package com.example.prueba_semana_12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ayuda2 extends AppCompatActivity {
    Button Regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayuda2);
        Button  Regresar = (Button)this.findViewById(R.id.btnRegresar);
        Regresar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent ayuda1 = new Intent(Ayuda2.this,Ayuda1.class);
                startActivity(ayuda1);
            }
        });

    }
}