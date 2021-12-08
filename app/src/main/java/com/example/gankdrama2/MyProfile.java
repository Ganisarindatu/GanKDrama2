package com.example.gankdrama2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MyProfile extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "Galleri";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_profile);
//        Intent i=new Intent(this, GaleriActivity.class);
//        startActivity(i);
    }
}