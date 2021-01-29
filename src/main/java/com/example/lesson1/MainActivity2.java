package com.example.lesson1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity2 extends AppCompatActivity {

    EditText editDate;
    CalendarView calendarView;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
// изменение для GIT...
        editDate = findViewById(R.id.editDate);
        calendarView = findViewById(R.id.calendarView);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                editDate.setText("");
                str = "";
                if(dayOfMonth < 10) str ="0";
                str += dayOfMonth + ".";
                month++;
                if(month < 10) str += "0";
                str += month + "." + year;
                editDate.setText(str);
            }
        });
    }

}