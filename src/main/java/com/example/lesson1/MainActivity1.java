package com.example.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity1 extends AppCompatActivity {

    TextView textView;
    EditText editText;
    Button button;
    Switch switchButton;
    CheckBox checkBox;
    ToggleButton toggleButton;
    String badText = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
// изменение для GIT
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        switchButton = findViewById(R.id.switchButton);
        checkBox = findViewById(R.id.checkBox);
        toggleButton = findViewById(R.id.toggleButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tmpStr = editText.getText().toString();
                if(tmpStr.equals("")) {
                    tmpStr = "Обленился совсем???";
                }
                textView.setText(tmpStr + badText);
                editText.setText("");
            }
        });

        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    button.setVisibility(View.VISIBLE);
                } else {
                    button.setVisibility(View.INVISIBLE);
                }
            }
        });

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    badText = " ГАДОСТЬ";
                } else {
                    badText = "";
                }
            }
        });

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    switchButton.setVisibility(View.VISIBLE);
                    checkBox.setVisibility(View.VISIBLE);
                } else {
                    switchButton.setVisibility(View.INVISIBLE);
                    checkBox.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

}