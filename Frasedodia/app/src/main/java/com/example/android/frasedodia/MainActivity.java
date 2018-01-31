package com.example.android.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView txt_novaFrase;
    private Button btn_novaFrase;

    private String[] frase = {
            "\"Se você traçar metas absurdamente altas e falhar, seu fracasso será muito melhor que o sucesso de todos\" – James Cameron, cineasta",
            "\"O sucesso normalmente vem para quem está ocupado demais para procurar por ele\" – Henry David Thoreau, filósofo",
            "\"A vida é melhor para aqueles que fazem o possível para ter o melhor – John Wooden, jogador e treinador de basquete",
            "\"Os empreendedores falham, em média, 3,8 vezes antes do sucesso final. O que separa os bem-sucedidos dos outros é a persistência\" – Lisa M. Amos, executiva",
            "\"Se você não está disposto a arriscar, esteja disposto a uma vida comum\" – Jim Rohn, empreendedor",
            "\"Escolha uma ideia. Faça dessa ideia a sua vida. Pense nela, sonhe com ela, viva pensando nela. Deixe cérebro, músculos, nervos, todas as partes do seu corpo serem preenchidas com essa ideia. Esse é o caminho para o sucesso\" – Swami Vivekananda, pensador hindu"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_novaFrase = findViewById(R.id.txt_novaFraseId);
        btn_novaFrase = findViewById(R.id.btn_novaFraseId);

        //txt_novaFrase.setText(frase[0]);
        btn_novaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int numRandom = random.nextInt(frase.length);
                txt_novaFrase.setText(frase[numRandom]);
            }
        });
    }
}
