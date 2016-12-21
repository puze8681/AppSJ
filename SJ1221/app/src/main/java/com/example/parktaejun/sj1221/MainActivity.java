package com.example.parktaejun.sj1221;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;
    private List<Stu> stuList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stuList.add(new Stu("홍길동",13));
        stuList.add(new Stu("짱구",13));
        stuList.add(new Stu("철수",13));
        stuList.add(new Stu("유리",13));
        stuList.add(new Stu("짱아",13));
        stuList.add(new Stu("태준",13));
        stuList.add(new Stu("정우",13));
        stuList.add(new Stu("미아캣",13));
        stuList.add(new Stu("호랑이",13));
        stuList.add(new Stu("은표",13));
        stuList.add(new Stu("코난",13));
        stuList.add(new Stu("최도이",13));



        gridView = (GridView) findViewById(R.id.gridview);
        CustomAdapter adapter = new CustomAdapter(stuList);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    //Toast.makeText(getApplicationContext(),ITEMS[position],Toast.LENGTH_SHORT).show();

            }
        });
    }
}
