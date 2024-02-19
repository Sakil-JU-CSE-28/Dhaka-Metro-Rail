package com.example.dhaka_metro_rail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddFeedBack extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_feed_back);
        ViewStations viewStations = new ViewStations();
        EditText editText = findViewById(R.id.editTextFeedback);
        String txt = editText.toString();
        Button btn = findViewById(R.id.buttonSubmit);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewStations.addFeedBack(txt);
            }
        });
    }
}