package com.example.primeira_lista;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //Clique do Botão Exercício 1
        final Button btn_Ex01 = (Button) findViewById(R.id.button_ex01);
        btn_Ex01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        //Clique do Botão Exercício 2
        final Button btn_Ex02 = (Button) findViewById(R.id.button_ex02);
        btn_Ex02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent);
            }
        });

        //Clique do Botão Exercício 3
        final Button btn_Ex03 = (Button) findViewById(R.id.button_ex03);
        btn_Ex03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity4.class);
                startActivity(intent);
            }
        });

        //Clique do Botão Exercício 4
        final Button btn_Ex04 = (Button) findViewById(R.id.button_ex04);
        btn_Ex04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity5.class);
                startActivity(intent);
            }
        });

        //Clique do Botão Exercício 5
        final Button btn_Ex05 = (Button) findViewById(R.id.button_ex05);
        btn_Ex05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity6.class);
                startActivity(intent);
            }
        });

        //Clique do Botão Exercício 6
        final Button btn_Ex06 = (Button) findViewById(R.id.button_ex06);
        btn_Ex06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity7.class);
                startActivity(intent);
            }
        });

        //Clique do Botão Exercício 7
        final Button btn_Ex07 = (Button) findViewById(R.id.button_ex07);
        btn_Ex07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity8.class);
                startActivity(intent);
            }
        });

        //Clique do Botão Exercício 8
        final Button btn_Ex08 = (Button) findViewById(R.id.button_ex08);
        btn_Ex08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity9.class);
                startActivity(intent);
            }
        });

        //Clique do Botão Exercício 9
        final Button btn_Ex09 = (Button) findViewById(R.id.button_ex09);
        btn_Ex09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity10.class);
                startActivity(intent);
            }
        });

        //Clique do Botão Exercício 10
        final Button btn_Ex10 = (Button) findViewById(R.id.button_ex10);
        btn_Ex10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity11.class);
                startActivity(intent);
            }
        });
    }
}