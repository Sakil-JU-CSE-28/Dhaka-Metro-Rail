package com.example.dhaka_metro_rail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;

/**
 * This class represents an activity for displaying the calculation of minimum time required.
 */
public class MinTime extends AppCompatActivity {

    private String sourceStation,destinationStation;

    /**
     * Called when the activity is starting. This is where most initialization should go.
     *
     * @param savedInstanceState If the activity is being re-initialized after previously
     *     being shut down then this Bundle contains the data it most recently supplied in
     *     onSaveInstanceState(Bundle). Note: Otherwise it is null.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_min_time); // Set the content view to the layout resource defined in XML.
        /**
         * when the button pressed on the interface
         * then this module work
         * 1. Find the selected spinner item
         * 2. calculate min cost using dijkstra algo
         * 3. show the cost and staions
         */

        Button btnMinTime = findViewById(R.id.btnViewMinTime);
        Spinner sourceStationSelector = findViewById(R.id.spinner1);
        Spinner destStationSelector = findViewById(R.id.spinner2);

        /**
         * Sets up the item selection listener for the source station spinner.
         * The selected source station is assigned to the sourceStation variable.
         *
         * @param sourceStationSelector The source station spinner
         */
        sourceStationSelector.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                sourceStation = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

                sourceStation = "";
            }
        });
        /**
         * Sets up the item selection listener for the destination station spinner.
         * The selected destination station is assigned to the destinationStation variable.
         *
         * @param destStationSelector The destination station spinner
         */
        destStationSelector.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                destinationStation = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

                destinationStation = "";
            }
        });

        /**
         * Sets up the click listener for the "Minimum Cost" button.
         * This method defines the behavior when the button is clicked.
         *
         * @param btnMinCost The "Minimum Cost" button
         */
        btnMinTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  //todo
            }
        });
    }
}
