package com.example.dhaka_metro_rail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * The main activity class where the program execution starts.
 */
public class MainActivity extends AppCompatActivity {

    private Button btnBuyTicket, btnInDanger, btnViewMetro, btnViewStations, btnMinTime, btnMinCost, btnSearchFriend, btnLogIn;

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
         * Set the content view of the activity to the layout defined in activity_main.xml.
         * This defines the layout for the user interface of the activity.
         */
        setContentView(R.layout.activity_main);

        /**
         * Initializing buttons
         */

        btnBuyTicket = findViewById(R.id.btnBuyTicket);
        btnInDanger = findViewById(R.id.btnInDanger);
        btnViewMetro = findViewById(R.id.btnViewMetro);
        btnViewStations = findViewById(R.id.btnViewStations);
        btnMinTime = findViewById(R.id.btnMinTime);
        btnMinCost = findViewById(R.id.btnMinCost);
        btnSearchFriend = findViewById(R.id.btnSearchFriend);
        btnLogIn = findViewById(R.id.btnLogIn);

        btnBuyTicket.setOnClickListener(new View.OnClickListener() {
            /**
             * implementation of Buy Ticket
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                // To do
            }
        });

        btnInDanger.setOnClickListener(new View.OnClickListener() {
            /***
             * implementation of In Danger Button
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                // To do
            }
        });

        btnViewMetro.setOnClickListener(new View.OnClickListener() {
            /**
             * implementation of view metro
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                // to do
            }
        });

        btnViewStations.setOnClickListener(new View.OnClickListener() {
            /**
             * implementation of view stations
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                // to do
            }
        });

        btnMinCost.setOnClickListener(new View.OnClickListener() {
            /**
             *  implementation of features that display the stations
             *  to travel with min cost from source station to
             *  destination station
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                // to do
            }
        });

        btnMinTime.setOnClickListener(new View.OnClickListener() {
            /**
             *  implementation of features that display the stations
             *  to travel with min time from source station to
             *  destination station
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                // to do
            }
        });

        btnSearchFriend.setOnClickListener(new View.OnClickListener() {
            /**
             * Sets an OnClickListener for the btnSearchFriend button.
             * This listener handles the click event for searching friends.
             *
             * @param v The View that was clicked (in this case, btnSearchFriend).
             */
            @Override
            public void onClick(View v) {
                // to do
            }
        });

        btnLogIn.setOnClickListener(new View.OnClickListener() {
            /**
             * Sets an OnClickListener for the btnLogIn button.
             * This listener handles the click event for logging into the metro system.
             *
             * @param v The View that was clicked (in this case, btnLogIn).
             */
            @Override
            public void onClick(View v) {
              // to do
            }
        });
    }
}