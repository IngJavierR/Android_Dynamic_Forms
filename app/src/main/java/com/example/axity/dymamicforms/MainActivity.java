package com.example.axity.dymamicforms;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SetUp();
        SetEvents();
    }

    private void SetUp() {
        btnNext = findViewById(R.id.btnNext);
    }

    private void SetEvents() {
        btnNext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent rogaIntent = new Intent(getApplicationContext(), RogaContainerActivity.class);
                startActivity(rogaIntent);
            }
        });
    }
}
