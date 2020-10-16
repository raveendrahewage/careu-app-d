package com.example.careu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class myprofile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
    }

    public void my_requests(View view) {
        Intent i= new Intent(this, myrequests.class);
        startActivity(i);
    }

    public void edit_profile(View view) {
        Intent i= new Intent(this,edit_prof.class);
        startActivity(i);
    }
}
