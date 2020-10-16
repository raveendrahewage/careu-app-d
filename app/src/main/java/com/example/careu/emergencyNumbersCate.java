package com.example.careu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class emergencyNumbersCate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_numbers_cate);
    }

    public void helath_click(View view) {
        Intent i = new Intent(this, emergencyNumbersHealth.class);
        startActivity(i);
    }

    public void police_click(View view) {
        Intent i = new Intent(this, emergencyNumbersPolice.class);
        startActivity(i);
    }

    public void fire_click(View view) {
        Intent i = new Intent(this, emergencyNumbersFire.class);
        startActivity(i);
    }

    public void others(View view) {
        Intent i = new Intent(this, emergencyNumbersOthers.class);
        startActivity(i);
    }
}