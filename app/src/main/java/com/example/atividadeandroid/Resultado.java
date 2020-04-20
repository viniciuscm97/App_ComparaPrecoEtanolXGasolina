package com.example.atividadeandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    private TextView tvResultado;
    private String valorResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        tvResultado = findViewById(R.id.tvRespostaEditavel);

        valorResultado = getIntent().getStringExtra("resultado");

        tvResultado.setText(String.valueOf(valorResultado));

    }
}
