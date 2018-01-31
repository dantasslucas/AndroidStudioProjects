package caraoucoroa.estudos.com.caraoucoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView btn_jogar;
    private String[] opcao={"cara","coroa"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_jogar = findViewById(R.id.btn_jogarId);

        btn_jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int randAleatorio = random.nextInt(2);
                Intent intent = new Intent(getApplicationContext(),DetalheActivity.class);
                intent.putExtra("opcaoMoeda",opcao[randAleatorio]);
                startActivity(intent);
            }
        });

    }
}
