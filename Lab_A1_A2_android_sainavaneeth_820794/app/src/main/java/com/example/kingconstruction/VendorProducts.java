package com.example.kingconstruction;

import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class VendorProducts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendor_products);

    }
    public int total(int cement, int steel, int brick, int sheets){
        if(cement == Integer.parseInt(null)){
            cement=0;
        }
        if(steel == Integer.parseInt(null)){
            steel=0;
        }
        if(brick == Integer.parseInt(null)){
            brick=0;
        }
        if(sheets == Integer.parseInt(null)){
            sheets=0;
        }
        int total=cement+brick+steel+sheets;
        return total;
    }
}