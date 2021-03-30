package com.example.parkingappse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public class ParkingActivity extends AppCompatActivity
{
//    RoomDatabase.Builder<AppDatabase> db=Room.databaseBuilder(this,AppDatabase.class,"User.db");
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking);
        Intent i=getIntent();
        int lotNo=i.getIntExtra("lotNo",1);
        int spotNo=i.getIntExtra("spotNo",1);
        Button parkingSubmit = findViewById(R.id.parkingBtnSubmit);
//        TextView parkingId=findViewById(R.id.parkingTxtIdValue);
        EditText name=findViewById(R.id.parkingTxtNameData);
        EditText noPlate=findViewById(R.id.parkingTxtCarNoData);
        EditText email=findViewById(R.id.parkingTxtEmailData);
        Spinner company=findViewById(R.id.parkingSpinCarCompany);
        EditText hours=findViewById(R.id.parkingEtNoHours);
//        TextView dateAndTime=findViewById(R.id.parkingTxtDateData);
        TextView lot=findViewById(R.id.parkingSpinLot);
        TextView spot=findViewById(R.id.parkingSpinSpot);
        lot.setText(String.valueOf(lotNo));
        spot.setText(String.valueOf(spotNo));


//        Date currentTime = Calendar.getInstance().getTime();






//        Booking booking=new Booking(name.getText().toString(),email.getText().toString(),noPlate.getText().toString(),company.getSelectedItem().toString(),hours.getText().toString(),lotNo,spotNo);

//        booking.setCarCompany(company.getSelectedItem().toString());
//        booking.setEmail(email.getText().toString());
//        booking.setNoOfHours(hours.getText().toString());
//        booking.setUserName(name.getText().toString());
//        booking.setNoPlate(noPlate.getText().toString());
//        booking.setLotNo(lotNo);
//        booking.setSpotNo(spotNo);
//        dateAndTime.setText((CharSequence) currentTime);
        parkingSubmit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Booking booking=new Booking(name.getText().toString(),email.getText().toString(),noPlate.getText().toString(),company.getSelectedItem().toString(),hours.getText().toString(),lotNo,spotNo);
                Toast.makeText(ParkingActivity.this,"Details Saved in database",Toast.LENGTH_LONG).show();
                DBInstance db=DBInstance.getInstance(ParkingActivity.this);
                AppDatabase appDb=db.getAppDatabase();
                appDb.parkingDAO().insert(booking);
                Intent it=new Intent(ParkingActivity.this,ParkingReceiptActivity.class);
                it.putExtra("name",name.getText().toString());
                it.putExtra("email",email.getText().toString());
                it.putExtra("hours",hours.getText().toString());
                it.putExtra("noPlate",noPlate.getText().toString());
                it.putExtra("company",company.getSelectedItem().toString());
                it.putExtra("lotno",lotNo);
                it.putExtra("spotno",spotNo);
//                i.putExtra("date",(CharSequence)currentTime);
                startActivity(it);
            }
        });
    }
}