package gasolinaoualcool.estudos.com.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText box_alcool;
    private EditText box_gasolina;
    private Button btn_verificar;
    private TextView txt_exibir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        box_alcool = findViewById(R.id.box_alcoolId);
        box_gasolina = findViewById(R.id.box_gasolId);
        btn_verificar = findViewById(R.id.btn_verificarId);
        txt_exibir = findViewById(R.id.txt_exibirId);

        btn_verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double alcool = Double.parseDouble(box_alcool.getText().toString());
                Double gasolina = Double.parseDouble(box_gasolina.getText().toString());
                Double resultado = alcool/gasolina;

                if (resultado>=0.7){
                    txt_exibir.setText("É melhor usar GASOLINA: " + resultado);
                }else{
                    txt_exibir.setText("É melhor usar ALCOOL: " + resultado);
                }
            }
        });
    }
}
