package com.example.setpboardbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;

public class Settings extends AppCompatActivity {
    TextView txt;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        txt = (TextView) findViewById(R.id.textView);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            b1.setBackgroundColor(Color.parseColor("#236B8E"));
            b2.setBackgroundColor(Color.parseColor("#236B8E"));
            txt.setTextColor(Color.parseColor("#FFA500"));
            }
        });
    }
}
