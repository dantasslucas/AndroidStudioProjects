package com.example.android.idadedeco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText box_idade;
    private TextView txt_idade;
    private Button btn_idade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        box_idade = findViewById(R.id.box_idadeId);
        txt_idade = findViewById(R.id.txt_idadeId);
        btn_idade = findViewById(R.id.btn_idadeId);

        btn_idade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Recuperar o digitado
                String txt_digitado = box_idade.getText().toString();

                if (txt_digitado.isEmpty()){
                    txt_idade.setText("Digite a idade desejada");
                }else{
                    int value_digitado = Integer.parseInt(txt_digitado)*7;
                    txt_idade.setText("Seu cachorro tem "+ value_digitado);
                }
            }
        });
    }
}
