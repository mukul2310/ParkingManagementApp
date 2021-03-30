package com.example.parkingappse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnExUser= findViewById(R.id.btnExUser);
        Button btnNewUser= findViewById(R.id.btnnewUser);

        btnExUser.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i=new Intent(MainActivity.this,VerificationActivity.class);
                startActivity(i);
            }
        });
        btnNewUser.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i=new Intent(MainActivity.this,ParkingSlotActivity.class);
                startActivity(i);
            }
        });
    }
}