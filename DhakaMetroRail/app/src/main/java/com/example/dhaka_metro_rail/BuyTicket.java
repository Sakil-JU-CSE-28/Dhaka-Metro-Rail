package com.example.dhaka_metro_rail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Activity class for buying tickets in the Dhaka Metro Rail application.
 * This activity allows users to purchase tickets for the metro rail service.
 */
public class BuyTicket extends AppCompatActivity {
    public BuyTicketDbController db = new BuyTicketDbController();
    private Spinner spinnerTicketType;
    private Spinner spinnerTicketQuantity;
    private Spinner spinnerStartingStation;
    private Spinner spinnerEndingStation;
    /**
     * Called when the activity is starting.
     *
     * @param savedInstanceState If the activity is being re-initialized after previously being shut down then this Bundle contains the data it most recently supplied in
     *                             onSaveInstanceState(Bundle). Note: Otherwise it is null.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /**
         * Call the superclass implementation of onCreate method to perform any necessary initialization.
         * This is required to ensure proper initialization of the activity.
         */
        super.onCreate(savedInstanceState);
        /**
         * Set the content view of the activity to the layout defined in activity_buy_ticket.xml.
         * This defines the layout for the user interface of the activity.
         */

        setContentView(R.layout.activity_buy_ticket);
        db.context = getApplicationContext();

        /**
         * this section is for handling event when purchase button is pressed
         */
        // Initialize the button by finding it's reference in the layout
        Button purchase = findViewById(R.id.btnPurchase);
        // set a listener to handle button pressed
        purchase.setOnClickListener(new View.OnClickListener() {
            /***
             * implementation of Purchase Button
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {

                spinnerTicketType = findViewById(R.id.spinnerTicketType);
                spinnerTicketQuantity = findViewById(R.id.spinnerTicketQuantity);
                spinnerStartingStation = findViewById(R.id.spinnerStartingStation);
                spinnerEndingStation = findViewById(R.id.spinnerEndingStation);
                String selectedTicketType = spinnerTicketType.getSelectedItem().toString();
                int selectedTicketQuantity = Integer.parseInt(spinnerTicketQuantity.getSelectedItem().toString());
                String selectedStartingStation = spinnerStartingStation.getSelectedItem().toString();
                String selectedEndingStation = spinnerEndingStation.getSelectedItem().toString();
                buyTicket(selectedTicketType,selectedTicketQuantity,selectedStartingStation,selectedEndingStation);
            }
        });
    }



    public long buyTicket(String selectedTicketType,int selectedTicketQuantity,String selectedStartingStation,String selectedEndingStation){
        long  sign = db.addTicket(selectedTicketType,selectedTicketQuantity,selectedStartingStation,selectedEndingStation);
        if(sign != -1)
         Toast.makeText(getApplicationContext(), "Purchase successful", Toast.LENGTH_SHORT).show();
        return sign;
    }

}