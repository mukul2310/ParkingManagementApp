package com.example.parkingappse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ParkingReceiptActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking_receipt);
        Intent i=getIntent();
        int lotNo=i.getIntExtra("lotno",1);
        int spotNo=i.getIntExtra("spotno",1);
        String username=i.getStringExtra("name");
        String email=i.getStringExtra("email");
        String hours=i.getStringExtra("hours");
        String noPlate=i.getStringExtra("noPlate");
        String company=i.getStringExtra("company");
//        String date=i.getStringExtra("date");

        TextView txtName=findViewById(R.id.txtVName);
        TextView txtEmail=findViewById(R.id.txtVEmail);
        TextView txtCarPlate=findViewById(R.id.textViewCarPlate);
        TextView txtCarCompany=findViewById(R.id.textViewCompany);
        TextView txthours=findViewById(R.id.textViewHours);
//        TextView txtdate=findViewById(R.id.textViewDate);
        TextView txtlot=findViewById(R.id.textViewLot);
        TextView txtspot=findViewById(R.id.textViewSpot);
        Button btn=findViewById(R.id.homebtn);

        txtName.setText(username);
        txtEmail.setText(email);
        txtCarCompany.setText(company);
        txthours.setText(hours);
        txtCarPlate.setText(noPlate);
//        txtdate.setText(date);
        txtlot.setText(String.valueOf(lotNo));
        txtspot.setText(String.valueOf(spotNo));
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i=new Intent(ParkingReceiptActivity.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}