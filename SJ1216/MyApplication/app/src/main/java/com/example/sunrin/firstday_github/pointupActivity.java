package com.example.sunrin.firstday_github;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class pointupActivity extends AppCompatActivity implements View.OnClickListener {

    private int i=0;

    TextView cntTv;
    Button upBt;
    SharedPreferences.Editor editor;
    SharedPreferences pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pointup);
        setDefault();

        pref = getSharedPreferences("pref", MODE_PRIVATE);
        editor = pref.edit();
        pref.getInt("key",0);
    }

    private void setDefault() {
        cntTv=(TextView)findViewById(R.id.cnt_tv);
        upBt=(Button)findViewById(R.id.up_bt);
        upBt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.up_bt:
                countup();
                break;
        }
    }

    private void countup() {
        i++;
        editor.putInt("key",i);
        editor.commit();
        //cntTv=
    }
}
