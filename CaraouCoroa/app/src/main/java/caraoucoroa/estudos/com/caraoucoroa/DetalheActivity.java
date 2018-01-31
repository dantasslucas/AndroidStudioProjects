package caraoucoroa.estudos.com.caraoucoroa;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetalheActivity extends AppCompatActivity {
    private ImageView img_moeda;
    private ImageView btn_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        img_moeda = findViewById(R.id.img_moedaId);
        btn_voltar = findViewById(R.id.btn_voltarId);

        Bundle extra = getIntent().getExtras();
        if (extra != null){
            String opcaoEscolhida = extra.getString("opcaoMoeda");
            if (opcaoEscolhida.equals("cara")){
                //Imagem cara
                img_moeda.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.moeda_cara));
            }else{
                //Imagem coroa
                img_moeda.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.moeda_coroa));
            }
        }
        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();
            }
        });



    }
}
