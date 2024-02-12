package com.example.dhaka_metro_rail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
/**
 * Activity class for viewing information to travel from source station to
 * destination station by min cost
 */
public class MinCost extends AppCompatActivity {

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
        setContentView(R.layout.activity_min_cost);
    }
}