package com.example.parktaejun.sjmission2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText text;
    private Button check;
    private Button clear;
    private TextView num;
    private int count;
    private int str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (EditText)findViewById(R.id.text);
        check = (Button)findViewById(R.id.check);
        clear = (Button)findViewById(R.id.clear);
        num = (TextView) findViewById(R.id.num);

        text.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                str = s.length();
                num.setText(str+"글자");
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        check.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                count = text.length();
                num.setText(count+"글자");

            }
        });

        clear.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                text.setText("");
                num.setText("0글자");
            }
        });
    }
}
