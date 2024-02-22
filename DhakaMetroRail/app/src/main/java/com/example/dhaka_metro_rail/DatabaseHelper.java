package com.example.dhaka_metro_rail;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ticket_database";
    private static final String TABLE_NAME = "tickets";
    private static final String COLUMN_TICKET_TYPE = "ticket_type";
    private static final String COLUMN_TICKET_QUANTITY = "ticket_quantity";
    private static final String COLUMN_STARTING_STATION = "starting_station";
    private static final String COLUMN_ENDING_STATION = "ending_station";
    private static final int DATABASE_VERSION = 1;
    private Context context;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableQuery = "CREATE TABLE " + TABLE_NAME + " ("
                + COLUMN_TICKET_TYPE + " TEXT, "
                + COLUMN_TICKET_QUANTITY + " INTEGER, "
                + COLUMN_STARTING_STATION + " TEXT, "
                + COLUMN_ENDING_STATION + " TEXT)";
        db.execSQL(createTableQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public long addTicket(String ticketType, int ticketQuantity, String startingStation, String endingStation) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_TICKET_TYPE, ticketType);
        contentValues.put(COLUMN_TICKET_QUANTITY, ticketQuantity);
        contentValues.put(COLUMN_STARTING_STATION, startingStation);
        contentValues.put(COLUMN_ENDING_STATION, endingStation);

        long result = db.insert(TABLE_NAME, null, contentValues);
        db.close();
        return result;
    }
}
