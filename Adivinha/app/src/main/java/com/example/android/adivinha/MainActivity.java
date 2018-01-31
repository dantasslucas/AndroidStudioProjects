package com.example.android.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button btnJogar;
    private TextView txtResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnJogar =(Button) findViewById(R.id.btn_jogar);
        txtResultado = (TextView) findViewById(R.id.txt_resultado);

        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int numAleatorio = random.nextInt(10);
                txtResultado.setText("Numero aleatorio "+numAleatorio);
            }
        });
    }
}
