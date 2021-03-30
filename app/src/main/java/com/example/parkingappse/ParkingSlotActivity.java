package com.example.parkingappse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.List;

public class ParkingSlotActivity extends AppCompatActivity
{
//    DBInstance db=DBInstance.getInstance(this);
//    AppDatabase appDb=db.getAppDatabase();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking_slot);

        final int[] lotNo = new int[1];
        final int[] spotNo = new int[1];
        ImageButton btnCar1=findViewById(R.id.btnCar1);
//        List<Booking> a=appDb.parkingDAO().getAll();

        btnCar1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                lotNo[0] =1;
                spotNo[0] =1;
                Intent i=new Intent(ParkingSlotActivity.this,ParkingActivity.class);
                i.putExtra("lotNo",lotNo[0]);
                i.putExtra("spotNo",spotNo[0]);
                startActivity(i);
            }
        });
        ImageButton btnCar2=findViewById(R.id.btnCar2);
        btnCar2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                lotNo[0] =1;
                spotNo[0] =2;
                Intent i=new Intent(ParkingSlotActivity.this,ParkingActivity.class);
                i.putExtra("lotNo",lotNo[0]);
                i.putExtra("spotNo",spotNo[0]);
                startActivity(i);
            }
        });
        ImageButton btnCar3=findViewById(R.id.btnCar3);
        btnCar3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                lotNo[0] =1;
                spotNo[0] =3;
                Intent i=new Intent(ParkingSlotActivity.this,ParkingActivity.class);
                i.putExtra("lotNo",lotNo[0]);
                i.putExtra("spotNo",spotNo[0]);
                startActivity(i);
            }
        });
        ImageButton btnCar4=findViewById(R.id.btnCar4);
        btnCar4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                lotNo[0] =1;
                spotNo[0] =4;
                Intent i=new Intent(ParkingSlotActivity.this,ParkingActivity.class);
                i.putExtra("lotNo",lotNo[0]);
                i.putExtra("spotNo",spotNo[0]);
                startActivity(i);
            }
        });
        ImageButton btnCar5=findViewById(R.id.btnCar5);
        btnCar5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                lotNo[0] =1;
                spotNo[0] =5;
                Intent i=new Intent(ParkingSlotActivity.this,ParkingActivity.class);
                i.putExtra("lotNo",lotNo[0]);
                i.putExtra("spotNo",spotNo[0]);
                startActivity(i);
            }
        });





        ImageButton btnCar6=findViewById(R.id.btnCar6);
        btnCar6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                lotNo[0] =2;
                spotNo[0] =1;
                Intent i=new Intent(ParkingSlotActivity.this,ParkingActivity.class);
                i.putExtra("lotNo",lotNo[0]);
                i.putExtra("spotNo",spotNo[0]);
                startActivity(i);
            }
        });
        ImageButton btnCar7=findViewById(R.id.btnCar7);
        btnCar7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                lotNo[0] =2;
                spotNo[0] =2;
                Intent i=new Intent(ParkingSlotActivity.this,ParkingActivity.class);
                i.putExtra("lotNo",lotNo[0]);
                i.putExtra("spotNo",spotNo[0]);
                startActivity(i);
            }
        });
        ImageButton btnCar8=findViewById(R.id.btnCar8);
        btnCar8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                lotNo[0] =2;
                spotNo[0] =3;
                Intent i=new Intent(ParkingSlotActivity.this,ParkingActivity.class);
                i.putExtra("lotNo",lotNo[0]);
                i.putExtra("spotNo",spotNo[0]);
                startActivity(i);
            }
        });
        ImageButton btnCar9=findViewById(R.id.btnCar9);
        btnCar9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                lotNo[0] =2;
                spotNo[0] =4;
                Intent i=new Intent(ParkingSlotActivity.this,ParkingActivity.class);
                i.putExtra("lotNo",lotNo[0]);
                i.putExtra("spotNo",spotNo[0]);
                startActivity(i);
            }
        });
        ImageButton btnCar10=findViewById(R.id.btnCar10);
        btnCar10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                lotNo[0] =2;
                spotNo[0] =5;
                Intent i=new Intent(ParkingSlotActivity.this,ParkingActivity.class);
                i.putExtra("lotNo",lotNo[0]);
                i.putExtra("spotNo",spotNo[0]);
                startActivity(i);
            }
        });




        ImageButton btnCar11=findViewById(R.id.btnCar11);
        btnCar11.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                lotNo[0] =3;
                spotNo[0] =1;
                Intent i=new Intent(ParkingSlotActivity.this,ParkingActivity.class);
                i.putExtra("lotNo",lotNo[0]);
                i.putExtra("spotNo",spotNo[0]);
                startActivity(i);
            }
        });
        ImageButton btnCar12=findViewById(R.id.btnCar12);
        btnCar12.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                lotNo[0] =3;
                spotNo[0] =2;
                Intent i=new Intent(ParkingSlotActivity.this,ParkingActivity.class);
                i.putExtra("lotNo",lotNo[0]);
                i.putExtra("spotNo",spotNo[0]);
                startActivity(i);
            }
        });
        ImageButton btnCar13=findViewById(R.id.btnCar13);
        btnCar13.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                lotNo[0] =3;
                spotNo[0] =3;
                Intent i=new Intent(ParkingSlotActivity.this,ParkingActivity.class);
                i.putExtra("lotNo",lotNo[0]);
                i.putExtra("spotNo",spotNo[0]);
                startActivity(i);
            }
        });
        ImageButton btnCar14=findViewById(R.id.btnCar14);
        btnCar14.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                lotNo[0] =3;
                spotNo[0] =4;
                Intent i=new Intent(ParkingSlotActivity.this,ParkingActivity.class);
                i.putExtra("lotNo",lotNo[0]);
                i.putExtra("spotNo",spotNo[0]);
                startActivity(i);
            }
        });
        ImageButton btnCar15=findViewById(R.id.btnCar15);
        btnCar15.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                lotNo[0] =3;
                spotNo[0] =5;
                Intent i=new Intent(ParkingSlotActivity.this,ParkingActivity.class);
                i.putExtra("lotNo",lotNo[0]);
                i.putExtra("spotNo",spotNo[0]);
                startActivity(i);
            }
        });




        ImageButton btnCar16=findViewById(R.id.btnCar16);
        btnCar16.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                lotNo[0] =4;
                spotNo[0] =1;
                Intent i=new Intent(ParkingSlotActivity.this,ParkingActivity.class);
                i.putExtra("lotNo",lotNo[0]);
                i.putExtra("spotNo",spotNo[0]);
                startActivity(i);
            }
        });
        ImageButton btnCar17=findViewById(R.id.btnCar17);
        btnCar17.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                lotNo[0] =4;
                spotNo[0] =2;
                Intent i=new Intent(ParkingSlotActivity.this,ParkingActivity.class);
                i.putExtra("lotNo",lotNo[0]);
                i.putExtra("spotNo",spotNo[0]);
                startActivity(i);
            }
        });
        ImageButton btnCar18=findViewById(R.id.btnCar18);
        btnCar18.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                lotNo[0] =4;
                spotNo[0] =3;
                Intent i=new Intent(ParkingSlotActivity.this,ParkingActivity.class);
                i.putExtra("lotNo",lotNo[0]);
                i.putExtra("spotNo",spotNo[0]);
                startActivity(i);
            }
        });
        ImageButton btnCar19=findViewById(R.id.btnCar19);
        btnCar19.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                lotNo[0] =4;
                spotNo[0] =4;
                Intent i=new Intent(ParkingSlotActivity.this,ParkingActivity.class);
                i.putExtra("lotNo",lotNo[0]);
                i.putExtra("spotNo",spotNo[0]);
                startActivity(i);
            }
        });
        ImageButton btnCar20=findViewById(R.id.btnCar20);
        btnCar20.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                lotNo[0] =4;
                spotNo[0] =5;
                Intent i=new Intent(ParkingSlotActivity.this,ParkingActivity.class);
                i.putExtra("lotNo",lotNo[0]);
                i.putExtra("spotNo",spotNo[0]);
                startActivity(i);
            }
        });




















        ImageButton btnCar21=findViewById(R.id.btnCar21);
        btnCar21.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                lotNo[0] =5;
                spotNo[0] =1;
                Intent i=new Intent(ParkingSlotActivity.this,ParkingActivity.class);
                i.putExtra("lotNo",lotNo[0]);
                i.putExtra("spotNo",spotNo[0]);
                startActivity(i);
            }
        });
        ImageButton btnCar22=findViewById(R.id.btnCar22);
        btnCar22.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                lotNo[0] =5;
                spotNo[0] =2;
                Intent i=new Intent(ParkingSlotActivity.this,ParkingActivity.class);
                i.putExtra("lotNo",lotNo[0]);
                i.putExtra("spotNo",spotNo[0]);
                startActivity(i);
            }
        });
        ImageButton btnCar23=findViewById(R.id.btnCar23);
        btnCar23.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                lotNo[0] =5;
                spotNo[0] =3;
                Intent i=new Intent(ParkingSlotActivity.this,ParkingActivity.class);
                i.putExtra("lotNo",lotNo[0]);
                i.putExtra("spotNo",spotNo[0]);
                startActivity(i);
            }
        });
        ImageButton btnCar24=findViewById(R.id.btnCar24);
        btnCar24.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                lotNo[0] =5;
                spotNo[0] =4;
                Intent i=new Intent(ParkingSlotActivity.this,ParkingActivity.class);
                i.putExtra("lotNo",lotNo[0]);
                i.putExtra("spotNo",spotNo[0]);
                startActivity(i);
            }
        });
        ImageButton btnCar25=findViewById(R.id.btnCar25);
        btnCar25.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                lotNo[0] =5;
                spotNo[0] =5;
                Intent i=new Intent(ParkingSlotActivity.this,ParkingActivity.class);
                i.putExtra("lotNo",lotNo[0]);
                i.putExtra("spotNo",spotNo[0]);
                startActivity(i);
            }
        });
    }
}