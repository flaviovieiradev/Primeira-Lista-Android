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

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main5);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        // Mapeando os componentes:
        final EditText ladodoquadrado = (EditText) findViewById(R.id.editText4);
        final TextView texto = (TextView) findViewById(R.id.textView10);
        final Button botao = (Button) findViewById(R.id.button9);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double lado, areadoQuadrado, areadoQuadradoaoDobro;

                lado = Double.parseDouble(ladodoquadrado.getText().toString());

                DecimalFormat df = new DecimalFormat("#.###");
                areadoQuadrado = lado * lado;
                areadoQuadradoaoDobro = areadoQuadrado * 2;

                String areadoQuadradoFormatadaString = df.format(areadoQuadrado);
                String areadoQuadradoaoDobroFormatadaString = df.format(areadoQuadradoaoDobro);

                texto.setText("A área do quadrado é "+ areadoQuadradoFormatadaString+". E seu dobro é "+ areadoQuadradoaoDobroFormatadaString);

            }
        });


        final Button btnvoltar = (Button) findViewById(R.id.button10);
        btnvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}