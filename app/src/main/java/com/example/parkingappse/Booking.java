package com.example.parkingappse;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Booking
{
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name="id",defaultValue = "1")
    private int parkingId;

    @ColumnInfo(name="user_name")
    private  String userName;
    @ColumnInfo(name="email")
    private  String email;

    public int getLotNo()
    {
        return lotNo;
    }

    public void setLotNo(int lotNo)
    {
        this.lotNo = lotNo;
    }

    public int getSpotNo()
    {
        return spotNo;
    }

    public void setSpotNo(int spotNo)
    {
        this.spotNo = spotNo;
    }

    @ColumnInfo(name="no_plate")
    private  String noPlate;

    @ColumnInfo(name="car_company")
    private  String carCompany;

    @ColumnInfo(name="no_of_hours")
    private String noOfHours;

    @ColumnInfo(name="lot_no")
    private int lotNo;

    public Booking( String userName, String email, String noPlate, String carCompany, String noOfHours, int lotNo, int spotNo)
    {
        this.userName = userName;
        this.email = email;
        this.noPlate = noPlate;
        this.carCompany = carCompany;
        this.noOfHours = noOfHours;
        this.lotNo = lotNo;
        this.spotNo = spotNo;
    }

    @ColumnInfo(name="spot_no")
    private int spotNo;

    public int getParkingId()
    {
        return parkingId;
    }

    public void setParkingId(int parkingId)
    {
        this.parkingId = parkingId;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getNoPlate()
    {
        return noPlate;
    }

    public void setNoPlate(String noPlate)
    {
        this.noPlate = noPlate;
    }

    public String getCarCompany()
    {
        return carCompany;
    }

    public void setCarCompany(String carCompany)
    {
        this.carCompany = carCompany;
    }

    public String getNoOfHours()
    {
        return noOfHours;
    }

    public void setNoOfHours(String noOfHours)
    {
        this.noOfHours = noOfHours;
    }
}
