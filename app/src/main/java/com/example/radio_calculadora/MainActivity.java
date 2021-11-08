package com.example.radio_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etval1, etval2;
    private TextView tvResultado;
    private RadioButton rbsum, rbrest, rbmul, rbdiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Conectar variable del programa con campos del area grafica
        etval1 = (EditText)findViewById(R.id.Numero_1);
        etval2 = (EditText)findViewById(R.id.Numero_2);
        tvResultado = (TextView)findViewById(R.id.tv_ValorResultado);
        rbsum = (RadioButton)findViewById(R.id.rb_Sumar);
        rbrest = (RadioButton)findViewById(R.id.rb_Restar);
        rbmul = (RadioButton)findViewById(R.id.rb_Multiplicar);
        rbdiv = (RadioButton)findViewById(R.id.rb_Dividir);
    }
    // Metodo para realizar los calculos
    public void Calcular(View v)
    {
        String val1_string = etval1.getText().toString();
        String val2_string = etval2.getText().toString();

        // Convertir en Valores Numericos

        float val1_float = Float.parseFloat(val1_string);
        float val2_float = Float.parseFloat(val2_string);

        if(rbsum.isChecked()==true)
        {
            float suma = val1_float + val2_float;
            String suma_string = String.valueOf(suma);
            tvResultado.setText(suma_string);
        }
        else if(rbrest.isChecked()==true)
        {
            float resta = val1_float - val2_float;
            String resta_string = String.valueOf(resta);
            tvResultado.setText(resta_string);
        }
        else if(rbmul.isChecked()==true)
        {
            float multi = val1_float * val2_float;
            String multi_string = String.valueOf(multi);
            tvResultado.setText(multi_string);
        }
        else if(rbdiv.isChecked()==true)
        {
            if (val2_float != 0)
            {
                float divide = val1_float / val2_float;
                String divide_string = String.valueOf(divide);
                tvResultado.setText(divide_string);
            }
            else
            {
                tvResultado.setText("Error");
            }
        }
    }
}