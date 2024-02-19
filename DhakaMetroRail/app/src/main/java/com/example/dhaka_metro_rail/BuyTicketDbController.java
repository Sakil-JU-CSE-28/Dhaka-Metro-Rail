package com.example.dhaka_metro_rail;

import android.content.Context;

public class BuyTicketDbController {
    Context context;
    private DatabaseHelper databaseHelper = new DatabaseHelper(context);

   public long addTicket(String selectedTicketType,int selectedTicketQuantity,String selectedStartingStation,String selectedEndingStation){
       return databaseHelper.addTicket(selectedTicketType,selectedTicketQuantity,selectedStartingStation,selectedEndingStation);
   }
}
