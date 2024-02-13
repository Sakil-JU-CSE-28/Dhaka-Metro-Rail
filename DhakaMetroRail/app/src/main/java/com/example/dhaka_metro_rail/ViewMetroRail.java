package com.example.dhaka_metro_rail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Set;

/**
 * Activity class for viewing information about the Dhaka Metro system.
 * This activity displays details about the metro system, such as routes, schedules, etc.
 */
public class ViewMetroRail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_metro_rail);

        // Create an instance of StationExtractor to extract metro information
        StationExtractor stationExtractor = new StationExtractor(getResources());

        // Retrieve metro information using StationExtractor
        Set<String> metros = stationExtractor.getMetro();

        // Get the container LinearLayout from the layout
        LinearLayout container = findViewById(R.id.container);

        // Iterate through each metro item
        for (String item : metros) {
            // Create a new CardView
            CardView cardView = new CardView(this);
            // Set layout parameters for the CardView
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );
            layoutParams.setMargins(16, 16, 16, 16);
            cardView.setLayoutParams(layoutParams);

            // Create a new TextView to display the metro item
            TextView textView = new TextView(this);
            // Set layout parameters for the TextView
            textView.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            ));
            // Set the text of the TextView to the current metro item
            textView.setText(item);
            // Add padding to the TextView
            textView.setPadding(16, 16, 16, 16);
            // Center the text within the TextView
            textView.setGravity(Gravity.CENTER);

            // Add the TextView to the CardView
            cardView.addView(textView);
            // Add the CardView to the container LinearLayout
            container.addView(cardView);

            // Set OnClickListener for the CardView
            cardView.setTag(item); // Set tag as item
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Retrieve clicked item from tag
                    String clickedItem = (String) v.getTag();
                    // Display a Toast message with the clicked item
                    Toast.makeText(ViewMetroRail.this, "Clicked: " + clickedItem, Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
