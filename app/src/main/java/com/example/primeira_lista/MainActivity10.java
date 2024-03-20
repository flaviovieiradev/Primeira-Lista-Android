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

public class MainActivity10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main10);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Mapeando os componentes:
        final EditText valordaAultura = (EditText) findViewById(R.id.editText12);
        final TextView texto = (TextView) findViewById(R.id.textView20);
        final Button botao = (Button) findViewById(R.id.button19);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double altura, pesoIdeal;

                altura = Double.parseDouble(valordaAultura.getText().toString());

                pesoIdeal = (72.7 * altura) - 58;

                DecimalFormat df_duascasas = new DecimalFormat("#.##");

                String pesoFormatado = df_duascasas.format(pesoIdeal);

                texto.setText("O peso ideal é: "+pesoFormatado);

            }
        });


        final Button btnvoltar = (Button) findViewById(R.id.button20);
        btnvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}