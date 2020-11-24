package com.example.cehua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cehua1(View view) {
        Intent intent = new Intent(this,Drawer.class);
        startActivity(intent);
    }

    public void cehua2(View view) {
    }
}