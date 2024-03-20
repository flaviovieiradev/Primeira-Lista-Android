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

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main7);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        // Mapeando os componentes:
        final EditText valorEmFahrenheit = (EditText) findViewById(R.id.editText7);
        final TextView texto = (TextView) findViewById(R.id.textView14);
        final Button botao = (Button) findViewById(R.id.button13);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double F, C;

                F = Double.parseDouble((valorEmFahrenheit.getText().toString()));

                C = (5 * (F-32) / 9);

                DecimalFormat df = new DecimalFormat("#.##");

                String CelsiusFormatadoString = df.format(C);

                texto.setText("O valor em graus Celsius é de: "+ CelsiusFormatadoString);

            }
        });


        final Button btnvoltar = (Button) findViewById(R.id.button14);
        btnvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}