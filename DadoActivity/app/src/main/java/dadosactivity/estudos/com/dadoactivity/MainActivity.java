package dadosactivity.estudos.com.dadoactivity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    private Button btn_dados;
    private EditText txt_nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_dados = findViewById(R.id.btn_dadosId);
        txt_nome = findViewById(R.id.txt_nomeId);

        btn_dados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = txt_nome.getText().toString();
                Intent intent = new Intent(getApplicationContext(),SegundaActivity.class);
                intent.putExtra("nome",nome);
                startActivity(intent);
            }
        });
    }
}
