package com.example.sunrin.firstday_github;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bt1,bt2,bt3;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setDefault();
    }

    private void setDefault() {
        bt1=(Button)findViewById(R.id.bt1);
        bt2=(Button)findViewById(R.id.bt2);
        bt3=(Button)findViewById(R.id.bt3);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.bt1:
                intent=new Intent(MainActivity.this, Q1Activity.class);
                startActivity(intent);
                break;
            case R.id.bt2:
                intent=new Intent(MainActivity.this, phonecheck_activity.class);
                startActivity(intent);
                break;
            case R.id.bt3:
                intent=new Intent(MainActivity.this, pointupActivity.class);
                startActivity(intent);
                break;
        }
    }
}
