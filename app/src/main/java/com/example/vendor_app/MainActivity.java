package com.example.vendor_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void NumberAuth(View view) {
    //   Toast myTost =   Toast.makeText(this ,"button was clicked ",Toast.LENGTH_LONG);
      //  myTost.show();
        // we use here Intent constructor ,this constructor is used  open new activity

        Intent intent = new Intent(this,numberAuth.class);
      startActivity(intent);
    }
}