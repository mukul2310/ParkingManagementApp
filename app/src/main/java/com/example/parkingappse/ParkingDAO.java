package com.example.parkingappse;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ParkingDAO
{

    @Query("SELECT * FROM Booking where user_name=:name and email=:email")
    List<Booking> getBooking(String name,String email);

    @Query("SELECT * FROM Booking where spot_no=:spotNo and lot_no=:lotNo")
    List<Booking> getBooking(int spotNo,int lotNo);

    @Query("SELECT * FROM Booking")
    List<Booking> getAll();

    @Query("SELECT * FROM Booking where id=:parkingId")
    List<Booking> getBook(int parkingId);

    @Insert
    void insert(Booking booking);

    @Insert
    void insertAll(List<Booking> booking);

    @Delete
    void delete(Booking booking);

    @Update
    void update(Booking booking);

}