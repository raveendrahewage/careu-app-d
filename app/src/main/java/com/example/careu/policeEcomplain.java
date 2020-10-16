package com.example.careu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;

public class policeEcomplain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_ecomplain);
    }

    public void cancecl_req(View view) {
        Intent i = new Intent(this,homePageDuplicate.class);
        startActivity(i);
    }

    public void uploadEvidence(View view) {
        if (ActivityCompat.checkSelfPermission(policeEcomplain.this, Manifest.permission.READ_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(policeEcomplain.this,
                    new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 100);
            return;
        }
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE,true);
        intent.setType("image/*");
        startActivityForResult(intent,1);
    }
}