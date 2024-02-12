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
    private String ticketType,ticketQuantity;
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
        /***
         * This section is for ticket type spinner
         */
        // Initialize the spinner by finding its reference in the layout
        Spinner spinner = findViewById(R.id.spinnerTicketType);

        // Set a listener to handle item selection events on the spinner
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            /**
             * Called when an item in the spinner is selected.
             *
             * @param parentView The AdapterView where the selection happened.
             * @param selectedItemView The view within the AdapterView that was clicked.
             * @param position The position of the view in the adapter.
             * @param id The row id of the item that is selected.
             */
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // Get the selected ticket type from the spinner and store it
                ticketType = parentView.getItemAtPosition(position).toString();

                // Display a toast message showing the selected ticket type
                Toast.makeText(getApplicationContext(), "Selected Ticket Type: " + ticketType, Toast.LENGTH_SHORT).show();
            }

            /**
             * Called when the selection disappears from this view. The selection can
             * disappear for instance when touch is activated or when the adapter becomes empty.
             *
             * @param parentView The AdapterView that now contains no selected item.
             */
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // Set the ticket type to "NULL" when nothing is selected
                ticketType = "NULL";
            }
        });

        /***
         * This section is for ticket quantity spinner
         */
        // Initialize the spinner by finding its reference in the layout
        Spinner spinnerTicetQuantity = findViewById(R.id.spinnerTicketQuantity);

        // Set a listener to handle item selection events on the spinner
        spinnerTicetQuantity.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            /**
             * Called when an item in the spinner is selected.
             *
             * @param parentView The AdapterView where the selection happened.
             * @param selectedItemView The view within the AdapterView that was clicked.
             * @param position The position of the view in the adapter.
             * @param id The row id of the item that is selected.
             */
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // Get the selected ticket type from the spinner and store it
                ticketQuantity = parentView.getItemAtPosition(position).toString();

                // Display a toast message showing the selected ticket type
                Toast.makeText(getApplicationContext(), "Selected Ticket Type: " + ticketQuantity, Toast.LENGTH_SHORT).show();
            }

            /**
             * Called when the selection disappears from this view. The selection can
             * disappear for instance when touch is activated or when the adapter becomes empty.
             *
             * @param parentView The AdapterView that now contains no selected item.
             */
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // Set the ticket type to "NULL" when nothing is selected
                ticketQuantity = "NULL";
            }
        });

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
                // to do
            }
        });

    }
}