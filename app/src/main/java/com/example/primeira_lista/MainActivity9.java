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

public class MainActivity9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main9);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Mapeando os componentes:
        final EditText primeiroInteiro = (EditText) findViewById(R.id.editText9);
        final EditText segundoInteiro = (EditText) findViewById(R.id.editText10);
        final EditText primeiroReal = (EditText) findViewById(R.id.editText11);
        final TextView texto = (TextView) findViewById(R.id.textView18);
        final Button botao = (Button) findViewById(R.id.button17);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int primeiroInt, segundoInt, primeiroCalculo;
                Double primeiroR, segundoCalculo, terceiroCalculo;

                primeiroInt = Integer.parseInt(primeiroInteiro.getText().toString());
                segundoInt = Integer.parseInt(segundoInteiro.getText().toString());
                primeiroR = Double.parseDouble(primeiroReal.getText().toString());

                primeiroCalculo = (primeiroInt *2) * (segundoInt / 2);

                segundoCalculo =  (primeiroInt * 3) + primeiroR;

                terceiroCalculo = Math.pow(primeiroR, 3);

                DecimalFormat df_duascasas = new DecimalFormat("#.##");
                DecimalFormat df_trescasas = new DecimalFormat("#.###");

                String primeiroCalculoFormatado = df_duascasas.format(primeiroCalculo);
                String segundoCalculoFormatado = df_trescasas.format(segundoCalculo);
                String terceiroCalculoFormatado = df_trescasas.format(terceiroCalculo);

                texto.setText("O produto do dobro do primeiro com metade do segundo é: "
                        + primeiroCalculoFormatado+". A soma do triplo do primeiro com o " +
                        "terceiro é: "+segundoCalculoFormatado+". O terceiro elevado ao " +
                        "cubo é: "+terceiroCalculoFormatado);

            }
        });


        final Button btnvoltar = (Button) findViewById(R.id.button18);
        btnvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }
}