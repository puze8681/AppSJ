package com.example.parktaejun.sjmission1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText year;
    private EditText month;
    private EditText date;
    private Button check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        year = (EditText) findViewById(R.id.year);
        month = (EditText) findViewById(R.id.month);
        date = (EditText) findViewById(R.id.date);
        check = (Button) findViewById(R.id.check);

        check.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                int y = Integer.parseInt(year.getText().toString());
                int m = Integer.parseInt(month.getText().toString());
                int d = Integer.parseInt(date.getText().toString());

                String ytext;
                String mtext;
                String dtext;

                if(((0 < m) && (m < 13)) && (0 < d) && (d < 32)){

                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);

                    switch (y%10){
                        case 0: ytext="외국에서"; break;
                        case 1: ytext="밤마다"; break;
                        case 2: ytext="어릴 적 부터"; break;
                        case 3: ytext="부모 잘못 만나서"; break;
                        case 4: ytext="타고나길"; break;
                        case 5: ytext="참하게 생겨서는"; break;
                        case 6: ytext="매일 아침마다"; break;
                        case 7: ytext="할일 없이"; break;
                        case 8: ytext="하루도 안빠지고"; break;
                        case 9: ytext="재수 없게"; break;
                    }

                    switch (m){
                        case 1: mtext="남의 심부름만 하던"; break;
                        case 2: mtext="굶을 일은 없었던"; break;
                        case 3: mtext="돈만 펑펑 쓰던"; break;
                        case 4: mtext="쫄쫄 굶었던"; break;
                        case 5: mtext="개 끌고 산책만 하던"; break;
                        case 6: mtext="쳐먹기만 했던"; break;
                        case 7: mtext="사기를 잘 치던"; break;
                        case 8: mtext="밖을 싸돌아더니던"; break;
                        case 9: mtext="남을 괴롭히기 좋아하던"; break;
                        case 10: mtext="애인을 갈아치우던"; break;
                        case 11: mtext="책 읽기를 좋아하던"; break;
                        case 12: mtext="밤일만 밝히던"; break;
                    }

                    switch (d){
                        case 1: dtext="미인대회 탈락자"; break;
                        case 2: dtext="조폭 두목"; break;
                        case 3: dtext="노름꾼"; break;
                        case 4: dtext="게이"; break;
                        case 5: dtext="내시"; break;
                        case 6: dtext="동네 바보"; break;
                        case 7: dtext="의사"; break;
                        case 8: dtext="친일파"; break;
                        case 9: dtext="백정"; break;
                        case 10: dtext="바람둥이"; break;
                        case 11: dtext="귀족"; break;
                        case 12: dtext="노숙자"; break;
                        case 13: dtext="빵셔틀"; break;
                        case 14: dtext="왕비"; break;
                        case 15: dtext="흥부네 막네"; break;
                        case 16: dtext="재벌집 자식"; break;
                        case 17: dtext="돌쇠"; break;
                        case 18: dtext="왕초"; break;
                        case 19: dtext="대통령 자식"; break;
                        case 20: dtext="이장님"; break;
                        case 21: dtext="앞잡이"; break;
                        case 22: dtext="예술가"; break;
                        case 23: dtext="왕자"; break;
                        case 24: dtext="대통령"; break;
                        case 25: dtext="기생"; break;
                        case 26: dtext="사업가"; break;
                        case 27: dtext="추노"; break;
                        case 28: dtext="아랍 석유 재벌"; break;
                        case 29: dtext="노예"; break;
                        case 30: dtext="공주"; break;
                        case 31: dtext="빵집점원"; break;
                    }

                    intent.putExtra("yeartext",y);
                    intent.putExtra("monthtext",m);
                    intent.putExtra("datetext",d);

                    Intent intent1 = new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(intent1);

                    finish();
                }

                else{
                    Toast toast = Toast.makeText(MainActivity.this, "숫자를 제대로 입력하세요!", Toast.LENGTH_SHORT );
                    toast.show();
                }
            }
        });
    }
}
