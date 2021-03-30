package com.example.parkingappse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class VerificationActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);
        EditText verifyUserName=findViewById(R.id.verifyUserName);
        EditText verifyEmail=findViewById(R.id.verifyEmail);
        Button btn=findViewById(R.id.btnVerify);

//        String name=verifyUserName.toString();



        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String name=verifyUserName.getText().toString();
                String email= verifyEmail.getText().toString();
                Intent i=new Intent(VerificationActivity.this,ParkingReportDetailActivity.class);
                DBInstance db=DBInstance.getInstance(VerificationActivity.this);
                AppDatabase appDb=db.getAppDatabase();
//                List<Booking> a=appDb.parkingDAO().getBooking(name,email);
                List<Booking> a=appDb.parkingDAO().getBooking(name,email);
                if(a.size()!=0)
                {
                    i.putExtra("name", a.get(0).getUserName());
                    i.putExtra("email", a.get(0).getEmail());
                    i.putExtra("hours", a.get(0).getNoOfHours());
                    i.putExtra("noPlate", a.get(0).getNoPlate());
                    i.putExtra("company", a.get(0).getCarCompany());
                    i.putExtra("lotno", a.get(0).getLotNo());
                    i.putExtra("spotno", a.get(0).getSpotNo());
                }
//                else
//                {
//                    i.putExtra("name", "manan");
//                    i.putExtra("email", "manan");
//                    i.putExtra("hours", "2");
//                    i.putExtra("noPlate", "abc");
//                    i.putExtra("company","BMW");
//                    i.putExtra("lotno", 1);
//                    i.putExtra("spotno", 3);
//                }
                startActivity(i);
            }
        });
    }
}