package com.example.aplicativocalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    private Button buttonUm,buttonDois,buttonTres,buttonQuatro,buttonCinco,buttonSeis,buttonSete,buttonOito,buttonNove,buttonZero;
    private Button buttonPonto,buttonResultado,buttonDivisao,buttonMultiplicacao,buttonSoma,buttonSubtracao,buttonDelete;
    private EditText editTextNumeros;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonUm = findViewById(R.id.buttonUm);
        buttonDois = findViewById(R.id.buttonDois);
        buttonTres = findViewById(R.id.buttonTres);
        buttonQuatro = findViewById(R.id.buttonQuatro);
        buttonCinco = findViewById(R.id.buttonCinco);
        buttonSeis = findViewById(R.id.buttonSeis);
        buttonSete = findViewById(R.id.buttonSete);
        buttonOito = findViewById(R.id.buttonOito);
        buttonNove = findViewById(R.id.buttonNove);
        buttonZero = findViewById(R.id.buttonZero);
        buttonPonto = findViewById(R.id.buttonPonto);
        buttonResultado = findViewById(R.id.buttonResultado);
        buttonDivisao = findViewById(R.id.buttonDivisao);
        buttonMultiplicacao = findViewById(R.id.buttonMultiplicacao);
        buttonSoma = findViewById(R.id.buttonSoma);
        buttonSubtracao = findViewById(R.id.buttonSubtracao);
        buttonDelete = findViewById(R.id.buttonDelete);
        editTextNumeros = findViewById(R.id.editTextNumeros);
    }

    public void calcular(View view)
    {

    }

    public void onClick (View view)
    {
        try
        {
            int id = view.getId();
            if (id == this.buttonUm.getId())
            {
                double numeroUm = 1;
            }
            else if (id == this.buttonDois.getId())
            {
                double numeroDois = 2;
            }
        }
        catch (Exception e)
        {
            System.out.println("Erro");
        }
    }

}