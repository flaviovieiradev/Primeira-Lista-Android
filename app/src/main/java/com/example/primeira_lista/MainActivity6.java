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

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main6);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Mapeando os componentes:
        final EditText horaSalario = (EditText) findViewById(R.id.editText5);
        final EditText horasTrabalhadas = (EditText) findViewById(R.id.editText6);
        final TextView texto = (TextView) findViewById(R.id.textView12);
        final Button botao = (Button) findViewById(R.id.button11);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double valorHoraSalario, qtdeHorasTrabalhadas, salario;

                valorHoraSalario = Double.parseDouble(horaSalario.getText().toString());
                qtdeHorasTrabalhadas = Double.parseDouble(horasTrabalhadas.getText().toString());

                DecimalFormat df = new DecimalFormat("#.##");

                salario = valorHoraSalario * qtdeHorasTrabalhadas;

                String valorSalarioFormatadoString = df.format(salario);

                texto.setText("O valor do salário é de R$ "+ valorSalarioFormatadoString);

            }
        });


        final Button btnvoltar = (Button) findViewById(R.id.button12);
        btnvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }
}