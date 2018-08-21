package com.dragon.radiogroup.Interfase;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.dragon.radiogroup.R;

public class RadioActivity extends Activity {
    private EditText et1, et2;
    private RadioButton rb1, rb2;
    private TextView tv1;
    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radio);

        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        rb1=findViewById(R.id.rb1);
        rb2=findViewById(R.id.rb2);
        tv1=findViewById(R.id.tv1);
        b1=findViewById(R.id.b1);
    }
}
