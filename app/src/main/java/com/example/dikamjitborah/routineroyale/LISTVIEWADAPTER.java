package com.example.dikamjitborah.routineroyale;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

import static com.example.dikamjitborah.routineroyale.CONSTANTS.FIRST_COLUMN;
import static com.example.dikamjitborah.routineroyale.CONSTANTS.SECOND_COLUMN;

/**
 * Created by Dikamjit Borah on 6/4/2017.
 */
public class LISTVIEWADAPTER extends BaseAdapter {
    public ArrayList<HashMap<String, String>> list;
    Activity activity;
    TextView txtFirst;
    TextView txtThird;

    public LISTVIEWADAPTER(Activity activity, ArrayList<HashMap<String, String>> list){
        super();
        this.activity=activity;
        this.list=list;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub



        LayoutInflater inflater=activity.getLayoutInflater();

        if(convertView == null){

            convertView=inflater.inflate(R.layout.column_row, null);

            txtFirst=(TextView) convertView.findViewById(R.id.c_rtextView1);
            txtThird=(TextView) convertView.findViewById(R.id.c_rtextView3);

        }

        HashMap<String, String> map=list.get(position);
        txtFirst.setText(map.get(FIRST_COLUMN));
        txtThird.setText(map.get(SECOND_COLUMN));

        return convertView;
    }

}
