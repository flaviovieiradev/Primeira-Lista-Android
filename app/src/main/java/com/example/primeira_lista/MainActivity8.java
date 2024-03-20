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

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main8);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        // Mapeando os componentes:
        final EditText valorEmCelsius = (EditText) findViewById(R.id.editText8);
        final TextView texto = (TextView) findViewById(R.id.textView16);
        final Button botao = (Button) findViewById(R.id.button15);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double F, C;

                C = Double.parseDouble((valorEmCelsius.getText().toString()));

                F= (9 * C + 160) / 5;

                DecimalFormat df = new DecimalFormat("#.##");

                String FahrenheitFormatado = df.format(F);

                texto.setText("O valor em graus Fahrenheit é de: "+ FahrenheitFormatado);

            }
        });


        final Button btnvoltar = (Button) findViewById(R.id.button16);
        btnvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

}