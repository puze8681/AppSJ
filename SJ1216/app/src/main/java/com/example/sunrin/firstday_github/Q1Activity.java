package com.example.sunrin.firstday_github;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Q1Activity extends AppCompatActivity implements View.OnClickListener {

    EditText et1;
    TextView tv1;
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);
        setDefault();
    }

    private void setDefault() {
        et1=(EditText)findViewById(R.id.writetext);
        tv1=(TextView)findViewById(R.id.subtext);
        bt1=(Button)findViewById(R.id.bt1);
        bt1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        et1.getText().toString();
        tv1.setText(et1.getText());
    }
}
