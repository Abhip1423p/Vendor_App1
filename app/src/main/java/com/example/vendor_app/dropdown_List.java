package com.example.vendor_app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class dropdown_List extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner spinner;
    private static final String[] paths = {" ","Cooked Food", "Uncooked Food Items", "Paan","Toys","Cloths-Shoes","Toys","Ice-cream-water-juice","Fruits","Books","others"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dropdown__list);
        spinner = (Spinner)findViewById(R.id.spinner);
        //create an arrayAdaptor
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(dropdown_List.this,android.R.layout.simple_spinner_item,paths);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);



    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        AlertDialog.Builder builder = new AlertDialog.Builder(dropdown_List.this);
        builder.setMessage("यह ऐप रेहड़ी पटरी व्यापारियों के लिए बनाई गई हैं। इस ऐप के दो उदेश्य है।\n" +
                " 1. आपको अपनी नियमित स्थान से व्यापार करने के दैनिक रिकॉर्ड की जानकारी\n" +
                "2. संबधित अधिकारियों को अपने आस पास कचरा निपटाने की सूचना देना \n" +
                "इस्तमाल के लिए साइन इन के बाय हां या नहीं का बटन दबाने पर आपको मैसेज आएगा\n" +
                "यह ऐप अभी प्रारंभिक अध्यन स्थिति में है। आप अपनी मर्जी से इसको इस्तेमाल कर सकते है।");
        builder.setCancelable(true);
        AlertDialog alert = builder.create();
        alert.show();





    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {




    }







    }


