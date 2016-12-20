package com.example.parktaejun.sjmission1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    private TextView alltext;
    private Button goback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        alltext = (TextView)findViewById(R.id.alltext);
        goback = (Button)findViewById(R.id.goback);

        String yeartext = getIntent().getStringExtra("yeartext");
        String monthtext = getIntent().getStringExtra("monthtext");
        String datetext = getIntent().getStringExtra("datetext");

        alltext.setText(yeartext + monthtext + datetext);

        goback.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent);

                finish();
            }
        });
    }

}
