package atmempresaconsultoria.estudos.com.atmempresaconsultoria;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {
    private ImageView btn_empresa;
    private ImageView btn_servico;
    private ImageView btn_cliente;
    private ImageView btn_contato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_empresa = findViewById(R.id.img_empresaId);
        btn_servico = findViewById(R.id.img_servicoId);
        btn_cliente = findViewById(R.id.img_clienteId);
        btn_contato = findViewById(R.id.img_contatoId);

        btn_empresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,EmpresaActivity.class));
            }
        });
        btn_servico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ServicoActivity.class));
            }
        });
        btn_cliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ClienteActivity.class));
            }
        });
        btn_contato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ContatoActivity.class));
            }
        });
    }
}
