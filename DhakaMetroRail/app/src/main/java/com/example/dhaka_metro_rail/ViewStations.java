package com.example.dhaka_metro_rail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Set;

/**
 * Activity class for viewing stations in the Dhaka Metro Rail application.
 * This activity displays a list of stations available in the metro rail network.
 */
public class ViewStations extends AppCompatActivity {

    /**
     * Called when the activity is starting. This is where most initialization
     * should go: calling setContentView(int) to inflate the activity's UI,
     * using findViewById(int) to programmatically interact with widgets in the UI,
     * and binding data to lists or other widgets.
     *
     * @param savedInstanceState If the activity is being re-initialized after previously
     *     being shut down then this Bundle contains the data it most recently supplied in
     *     onSaveInstanceState(Bundle). Note: Otherwise it is null.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_stations);
        // Get the TextView from the layout
        TextView textViewStations = findViewById(R.id.textViewStations);

        // Get the stations from the StationExtractor class
        StationExtractor stationExtractor = new StationExtractor(getResources());
        Set<String> stations = stationExtractor.getStations();

        // Create a StringBuilder to construct the text
        StringBuilder stringBuilder = new StringBuilder();

        // Append each station to the StringBuilder
        for (String station : stations) {
            stringBuilder.append(station).append("\n");
        }

        // Set the text of the TextView to the constructed string
        textViewStations.setText(stringBuilder.toString());
    }
}