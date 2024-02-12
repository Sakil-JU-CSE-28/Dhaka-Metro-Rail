package com.example.dhaka_metro_rail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * This class represents an activity for displaying the calculation of minimum time required.
 */
public class MinTime extends AppCompatActivity {

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
    }
}
