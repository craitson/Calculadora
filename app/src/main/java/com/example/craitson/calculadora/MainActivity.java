package com.example.craitson.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView visor;
    private TextView visorConta;
    String numero  = "";
    String numero1 = "";
    String numero2 = "";
    String operacao = "";
    String result = "";

    double n1 =0;
    double n2 =0;
    double resultado = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.visor = (TextView) findViewById(R.id.visor);
        this.visorConta = (TextView) findViewById(R.id.visorConta);

    }

    public void limpaVisor(View v){
        this.visor.setText("0");
        this.visorConta.setText("");
        System.out.println("Limpando visor");
        numero = "";
        numero1 = "";
        numero2 = "";
        resultado = 0;
    }

    public void passaVisor (View v){

        switch (v.getId()) {
            case R.id.one:
                numero += 1;
                this.visor.setText(numero);
                System.out.println("1");
                break;
            case R.id.two:
                numero += 2;
                this.visor.setText(numero);
                System.out.println("2");
                break;
            case R.id.tree:
                numero += 3;
                this.visor.setText(numero);
                System.out.println("3");
                break;
            case R.id.four:
                numero += 4;
                this.visor.setText(numero);
                System.out.println("4");
                break;
            case R.id.five:
                numero += 5;
                this.visor.setText(numero);
                System.out.println("5");
                break;
            case R.id.six:
                numero += 6;
                this.visor.setText(numero);
                System.out.println("6");
                break;
            case R.id.seven:
                numero += 7;
                this.visor.setText(numero);
                System.out.println("7");
                break;
            case R.id.eight:
                numero += 8;
                this.visor.setText(numero);
                System.out.println("8");
                break;
            case R.id.nine:
                numero += 9;
                this.visor.setText(numero);
                System.out.println("9");
                break;
            case R.id.zero:
                if (!numero.equals("")){
                    numero += 0;
                    this.visor.setText(numero);
                    System.out.println("0");
                }
                break;
            case R.id.mais:
                if(resultado != 0) {
                    numero1 = result;
                    this.visor.setText("");
                    operacao = "+";
                    numero = "";
                }else{
                    System.out.println("Mais");
                    numero1 = numero;
                    numero = "";
                    this.visor.setText("");
                    operacao = "+";
                }


                break;

            case R.id.menos:
                System.out.println("Menos");
                numero1 = numero;
                numero = "";
                this.visor.setText("");
                operacao = "-";
                break;
            case R.id.vezes:
                System.out.println("Vezes");
                numero1 = numero;
                numero = "";
                this.visor.setText("");
                operacao = "X";
                break;
            case R.id.dividido:
                System.out.println("Dividido");
                numero1 = numero;
                numero = "";
                this.visor.setText("");
                operacao = "/";
                break;
        }

    }

    public void igual (View v) {
        numero2 = numero;

        this.visorConta.setText(numero1 + " " + operacao + " " + numero2);

        n1 = Integer.parseInt(numero1);
        n2 = Integer.parseInt(numero2);

        if(operacao.equals("+")) {
            resultado = n1 + n2;
            result = String.valueOf(resultado);
            this.visor.setText(result);

            numero1 = "";
            numero2 = "";
            n1 = 0;
            n2 = 0;

        }else if(operacao.equals("-")){
            resultado = n1 - n2;
            result = String.valueOf(resultado);
            this.visor.setText(result);

            numero1 = "";
            numero2 = "";
            n1 = 0;
            n2 = 0;

        }else if(operacao.equals("X")){
            resultado = n1 * n2;
            result = String.valueOf(resultado);
            this.visor.setText(result);

            numero1 = "";
            numero2 = "";
            n1 = 0;
            n2 = 0;

        }else if(operacao.equals("/")){
            resultado = n1 / n2;
            result = String.valueOf(resultado);
            this.visor.setText(result);

            numero1 = "";
            numero2 = "";
            n1 = 0;
            n2 = 0;
        }
    }
}
