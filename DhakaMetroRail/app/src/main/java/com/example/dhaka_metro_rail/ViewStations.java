package com.example.dhaka_metro_rail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

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
   public String clickedItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_stations);
        // Get the stations from the StationExtractor class
        StationExtractor stationExtractor = new StationExtractor(getResources());
        Set<String> stations = stationExtractor.getStations();
        // Get the container LinearLayout from the layout
        LinearLayout container = findViewById(R.id.containerStation);

        // Iterate through each metro item
        for (String item : stations) {
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
                    clickedItem = (String) v.getTag();
                    Intent intent = new Intent(ViewStations.this, AddFeedBack.class);
                    startActivity(intent);
                }
            });
        }
    }

    public void addFeedBack(String txt){
             StationExtractor stationExtractor = new StationExtractor(getResources());
             stationExtractor.addFeedBack(txt,clickedItem);
    }
}