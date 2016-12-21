package com.example.parktaejun.sj1221;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by parktaejun on 2016. 12. 21..
 */

public class CustomAdapter extends BaseAdapter {

    private List<Stu> stuList;

    public CustomAdapter(List<Stu> stuList){
        this.stuList = stuList;
    }

    @Override
    public int getCount() {
        //리스트뷰에 뿌려질 데이터의 개수
        return stuList.size();
    }

    @Override
    public Object getItem(int position) {
        return stuList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //xml 불러오고
        //데이터를 직접 넣어주고
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,null);


        ImageView imageView = (ImageView)view.findViewById(R.id.imageView);
        TextView textViewID = (TextView)view.findViewById(R.id.textViewID);
        TextView textViewNAME = (TextView)view.findViewById(R.id.textViewName);

        //여러 학생중 특정 position에 있는 한 학생을 불러온다
        Stu stu = stuList.get(position);

        String id = String.valueOf(stu.getId());
        String name = stu.getName();

        textViewID.setText(id);
        textViewNAME.setText(name);

        return null;
    }
}
