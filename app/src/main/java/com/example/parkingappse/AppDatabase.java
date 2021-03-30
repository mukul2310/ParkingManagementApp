package com.example.parkingappse;

import androidx.room.Database;
import androidx.room.RoomDatabase;
@Database(entities = {Booking.class}, version = 3)
public abstract class AppDatabase extends RoomDatabase
{
    public abstract ParkingDAO parkingDAO();
}
