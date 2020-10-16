package com.example.careu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import org.w3c.dom.Text;

public class loginPage extends AppCompatActivity {

    Button btnlogin;
    TextView forgetpw;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        sp = getSharedPreferences("login",MODE_PRIVATE);
        if(sp.getBoolean("logged",false)){
            Intent i = new Intent(this,homePageDuplicate.class);
            startActivity(i);
        }

//        btnlogin = findViewById(R.id.btnLog);
//
//        btnlogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(getApplicationContext(),homePage.class);
//                startActivity(i);
//            }
//        });


        forgetpw = findViewById(R.id.txtfp);
        forgetpw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), forgetPassword.class);
                startActivity(intent);
            }
        });
    }
    public void homePage(View view) {
        sp.edit().putBoolean("logged",true).apply();
        Intent ne = new Intent(this,homePageDuplicate.class);
        startActivity(ne);
    }
}
