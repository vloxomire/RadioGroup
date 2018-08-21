package com.dragon.radiogroup.Interfase;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.dragon.radiogroup.R;

public class RadioActivity extends Activity {
    private EditText et1, et2;
    private RadioButton rb1, rb2;
    private TextView tv1;
    private Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radio);
        //Metodo findViewById vinculo objetos con el atributo id
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        tv1 = findViewById(R.id.tv1);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
    }
    public void calcular(View v){
        int valor1 = Integer.parseInt(et1.getText().toString());
        int valor2 = Integer.parseInt(et2.getText().toString());
        if (rb1.isChecked() == true) {
            int suma = valor1 + valor2;
            String resu = String.valueOf(suma);
            tv1.setText(resu);
        } else if (rb2.isChecked() == true) {
            int resta = valor1 - valor2;
            String resu = String.valueOf(resta);
            tv1.setText(resu);
        }
    }
}