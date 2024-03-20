package com.example.primeira_lista;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;

public class MainActivity11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main11);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Mapeando os componentes:
        final EditText tamanhoDoArquivo = (EditText) findViewById(R.id.editText13);
        final EditText velocidadeDoLink = (EditText) findViewById(R.id.editText14);
        final TextView texto = (TextView) findViewById(R.id.textView22);
        final Button botao = (Button) findViewById(R.id.button21);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double tamArquivo, velDoLink, tempoDeDownload;

                tamArquivo = Double.parseDouble(tamanhoDoArquivo.getText().toString());
                velDoLink = Double.parseDouble(velocidadeDoLink.getText().toString());


                tempoDeDownload = 60 * (tamArquivo / (velDoLink / 8));
                //OBS: O resultado da conta acima é o tempo em minutos.

                DecimalFormat df_duascasas = new DecimalFormat("#");

                String tempoDeDownloadFormatado = df_duascasas.format(tempoDeDownload);

                texto.setText("O tempo estimado restante do download é de "
                        +tempoDeDownloadFormatado+" minutos." );

            }
        });


        final Button btnvoltar = (Button) findViewById(R.id.button22);
        btnvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}