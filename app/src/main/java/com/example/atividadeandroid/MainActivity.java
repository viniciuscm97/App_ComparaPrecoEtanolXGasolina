package com.example.atividadeandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etGasolina, etEtanol;
    private Button btnCalculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etGasolina = findViewById(R.id.etGasolina);
        etEtanol = findViewById(R.id.etEtanol);

        btnCalculo = findViewById(R.id.btnCalculo);

        btnCalculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Resultado.class);
                intent.putExtra("resultado", calcular());
                startActivity( intent );
            }
        });



    }

    private String calcular() {
        Float etanol = Float.parseFloat(etEtanol.getText().toString());
        Float gasolina = Float.parseFloat(etGasolina.getText().toString());

        float calculo = etanol / gasolina;

        String resultado = "";

        if (etanol.toString().isEmpty() || gasolina.toString().isEmpty()) {
            Toast.makeText(this,"Os valores de gasolina ou etanol não foram preenchidos!", Toast.LENGTH_LONG).show();
        }else{
            if (calculo < 0.7){
                resultado = "Etanol";
            }else{
                resultado = "Gasolina";
            }

        }

        return resultado;

    }


}
