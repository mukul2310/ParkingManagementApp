package com.example.parkingappse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ParkingReportDetailActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking_report_detail);
        TextView tvName=findViewById(R.id.txtVName);
        TextView tvEmail=findViewById(R.id.txtVEmail);
        TextView tvNoPlate=findViewById(R.id.textViewCarPlate);
        TextView tvCarCompany=findViewById(R.id.textViewCompany);
        TextView tvHours=findViewById(R.id.textViewHours);
        TextView tvLotNo=findViewById(R.id.textViewLot);
        TextView tvSpotNo=findViewById(R.id.textViewSpot);
        Button btn=findViewById(R.id.btnChkout);

        Intent i=getIntent();
        String name=i.getStringExtra("name");
        String email=i.getStringExtra("email");
        String hours=i.getStringExtra("hours");
        String noPlate=i.getStringExtra("noPlate");
        String company=i.getStringExtra("company");
        int lotNo=i.getIntExtra("lotno",1);
        int spotNo=i.getIntExtra("spotno",1);

        tvName.setText(name);
        tvEmail.setText(email);
        tvHours.setText(hours);
        tvLotNo.setText(String.valueOf(lotNo));
        tvSpotNo.setText(String.valueOf(spotNo));
        tvNoPlate.setText(noPlate);
        tvCarCompany.setText(company);

        DBInstance db=DBInstance.getInstance(this);
        AppDatabase appDb=db.getAppDatabase();

        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
//                appDb.parkingDAO().delete();
                Intent i=new Intent(ParkingReportDetailActivity.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}