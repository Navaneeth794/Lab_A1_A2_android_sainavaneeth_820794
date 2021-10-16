package com.example.kingconstruction;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class HomePage extends AppCompatActivity {

    private Button button;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page2);
        button = findViewById(R.id.vender);
        button.setOnClickListener(event->{
            Intent intent = new Intent(HomePage.this, VendorProducts.class);
            startActivity(intent);
        });
        button2 = findViewById(R.id.manufacturer);
        button2.setOnClickListener(event->{
            Intent intent = new Intent(HomePage.this, Catalogue.class);
            startActivity(intent);
        });
    }
}