package com.example.vendor_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.hbb20.CountryCodePicker;

public class numberAuth extends AppCompatActivity {
private Button savePhoneNumber;
private TextView getPhoneNumber;
private EditText edit_text;
private CountryCodePicker ccp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_number_auth);


        init();
    }
    private void init(){
        ccp =findViewById(R.id.ccp);
        edit_text = findViewById(R.id.edit_text);

        savePhoneNumber = findViewById(R.id.savePhoneNumber);
       // getPhoneNumber =findViewById(R.id.getPhoneNumber);


    }


    public void DisplayMessage(View view) {
        Toast myToast =   Toast.makeText(this,"data save",Toast.LENGTH_LONG);

        myToast.show();

    }
}