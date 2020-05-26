package com.example.dikamjitborah.routineroyale;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    Button fp;
    Spinner spinnerVar;
    TextView text1, text2;
    String[] days =
            {       "Select Day",
                    "Monday",
                    "Tuesday",
                    "Wednesday",
                    "Thursday",
                    "Friday"
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "Datalegreya-Dot.otf");
        Typeface typeface2 = Typeface.createFromAsset(getAssets(), "PoiretOne-Regular.ttf");
        Typeface typeface3 = Typeface.createFromAsset(getAssets(), "DISTGRG_.ttf");
        Typeface typeface4 = Typeface.createFromAsset(getAssets(), "Metro.otf");


        spinnerVar = (Spinner) findViewById(R.id.SpinnerMenu);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner, days);
        spinnerVar.setAdapter(adapter);
        spinnerVar.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //int position = spinner.getSelectedItemPosition();
                String menu = spinnerVar.getSelectedItem().toString();

                if (menu.equals("Monday")) {
                    Intent intent = new Intent(MainActivity.this, MONDAY.class);
                    startActivity(intent);
                } else if (menu.equals("Tuesday")) {
                    Intent intent = new Intent(MainActivity.this, TUESDAY.class);
                    startActivity(intent);
                } else if (menu.equals("Wednesday")) {
                    Intent intent = new Intent(MainActivity.this, WEDNESDAY.class);
                    startActivity(intent);
                } else if (menu.equals("Thursday")) {
                    Intent intent = new Intent(MainActivity.this, THURSDAY.class);
                    startActivity(intent);
                } else if (menu.equals("Friday")) {
                    Intent intent = new Intent(MainActivity.this, FRIDAY.class);
                    startActivity(intent);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        fp = (Button) findViewById(R.id.FilePicker);
        fp.setTypeface(typeface3);

        text1 = (TextView) findViewById(R.id.textView1);
        text1.setTypeface(typeface1);

        text2 = (TextView) findViewById(R.id.textView2);
        text2.setTypeface(typeface4);

        String weekDay = "";
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        if (Calendar.MONDAY == dayOfWeek) {
            weekDay = "Monday";
            text1.setText("Today is " + weekDay);

            fp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, MONDAY.class);
                    startActivity(intent);
                }
            });
        } else if (Calendar.TUESDAY == dayOfWeek) {
            weekDay = "Tuesday";
            text1.setText("Today is " + weekDay);
            fp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, TUESDAY.class);
                    startActivity(intent);
                }
            });
        } else if (Calendar.WEDNESDAY == dayOfWeek) {
            weekDay = "Wednesday";
            text1.setText("Today is " + weekDay);
            fp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, WEDNESDAY.class);
                    startActivity(intent);
                }
            });
        } else if (Calendar.THURSDAY == dayOfWeek) {
            weekDay = "Thursday";
            text1.setText("Today is " + weekDay);
            fp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, THURSDAY.class);
                    startActivity(intent);
                }
            });
        } else if (Calendar.FRIDAY == dayOfWeek) {
            weekDay = "Friday";
            text1.setText("Today is " + weekDay);
            fp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, FRIDAY.class);
                    startActivity(intent);
                }
            });
        } else if (Calendar.SATURDAY == dayOfWeek) {
            weekDay = "Saturday";
            text1.setText("Today is " + weekDay);
            fp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "YOU HAVE NO CLASSES TODAY", Toast.LENGTH_SHORT).show();
                }
            });
        } else if (Calendar.SUNDAY == dayOfWeek) {
            weekDay = "Sunday";
            text1.setText("Today is " + weekDay);
            fp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "YOU HAVE NO CLASSES TODAY", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
