package com.example.setpboardbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PlayMatchmaking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_matchmaking);
    }

    public void BackBtnPlay(View view){
        Intent myIntent = new Intent(PlayMatchmaking.this, MainActivity.class);
        startActivity(myIntent);
    }
}
