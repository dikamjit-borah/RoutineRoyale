package com.example.dikamjitborah.routineroyale;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

import static com.example.dikamjitborah.routineroyale.CONSTANTS.FIRST_COLUMN;
import static com.example.dikamjitborah.routineroyale.CONSTANTS.SECOND_COLUMN;


public class WEDNESDAY extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wednesday);

        ListView listView=(ListView)findViewById(R.id.w_listView);

        ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String, String>>();

        HashMap<String,String> temp=new HashMap<String, String>();
        temp.put(FIRST_COLUMN, "FLAT");
        temp.put(SECOND_COLUMN, "09:00 - 10:00");

        list.add(temp);

        HashMap<String,String> temp2=new HashMap<String, String>();
        temp2.put(FIRST_COLUMN, "DBMS");
        temp2.put(SECOND_COLUMN, "10:00 - 11:00");

        list.add(temp2);

        HashMap<String,String> temp3=new HashMap<String, String>();
        temp3.put(FIRST_COLUMN, "Mathematics");
        temp3.put(SECOND_COLUMN, "11:00 - 12:00");

        list.add(temp3);

        HashMap<String,String> temp4=new HashMap<String, String>();
        temp4.put(FIRST_COLUMN, "L U N C H ");
        temp4.put(SECOND_COLUMN, "12:00 - 12:55");

        list.add(temp4);

        HashMap<String,String> temp5=new HashMap<String, String>();
        temp5.put(FIRST_COLUMN, "Microprocessors");
        temp5.put(SECOND_COLUMN, "12:55 - 13:50");

        list.add(temp5);

        HashMap<String,String> temp6=new HashMap<String, String>();
        temp6.put(FIRST_COLUMN, "-");
        temp6.put(SECOND_COLUMN, "13:50 - 14:45");

        list.add(temp6);

        HashMap<String,String> temp7=new HashMap<String, String>();
        temp7.put(FIRST_COLUMN, "Computer Graphics");
        temp7.put(SECOND_COLUMN, "14:45 - 15:40");

        list.add(temp7);

        HashMap<String,String> temp8=new HashMap<String, String>();
        temp8.put(FIRST_COLUMN, "Computer Graphics");
        temp8.put(SECOND_COLUMN, "15:40 - 16:35");

        list.add(temp8);

        HashMap<String,String> temp9=new HashMap<String, String>();
        temp9.put(FIRST_COLUMN, "Activity");
        temp9.put(SECOND_COLUMN, "16:35 - 17:15");

        list.add(temp9);









        LISTVIEWADAPTER adapter=new LISTVIEWADAPTER(this, list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, final View view, int position, long id)
            {
              //  int pos=position+1;
                //Toast.makeText(WEDNESDAY.this, Integer.toString(pos)+" Clicked", Toast.LENGTH_SHORT).show();
            }

        });

    }
}