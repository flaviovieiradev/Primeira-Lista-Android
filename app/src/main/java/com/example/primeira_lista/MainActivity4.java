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

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Mapeando os componentes:
        final EditText raiodocirculo = (EditText) findViewById(R.id.editText3);
        final TextView texto = (android.widget.TextView) findViewById(R.id.textView8);
        final Button botao = (Button) findViewById(R.id.button7);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double raio, area;
                String areaFormatada;
                raio = Double.parseDouble(raiodocirculo.getText().toString());

                DecimalFormat df = new DecimalFormat("#.###");
                area = Math.PI * Math.pow(raio, 2);
                String areaFormatadaString = df.format(area);

                texto.setText("A área do círculo é "+ areaFormatadaString);
            }
        });


        final Button btnvoltar = (Button) findViewById(R.id.button8);
        btnvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}