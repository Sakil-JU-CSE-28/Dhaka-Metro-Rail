package com.example.dhaka_metro_rail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Set;

/**
 * Activity class for viewing information about the Dhaka Metro system.
 * This activity displays details about the metro system, such as routes, schedules, etc.
 */
public class ViewMetro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_metro);
        // Create an instance of StationExtractor to extract metro information
        MetroExtractor extractor = new MetroExtractor();
        // Retrieve metro information using StationExtractor
        Set<String> metros = extractor.getMetros(getApplicationContext(),R.raw.metro);

        // Create a StringBuilder to construct the text
        StringBuilder stringBuilder = new StringBuilder();

        // Append each metro to the StringBuilder
        for (String metro : metros) {
            stringBuilder.append(metro).append("\n");
        }

        // Set the text of the TextView to the constructed string
        TextView textViewMetros = findViewById(R.id.textViewMetros);
        textViewMetros.setText(stringBuilder.toString());
    }
}