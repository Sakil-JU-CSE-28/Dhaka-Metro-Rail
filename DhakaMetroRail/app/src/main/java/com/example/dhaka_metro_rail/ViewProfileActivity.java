package com.example.dhaka_metro_rail;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
/**
 * for viewing the info
 */
public class ViewProfileActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_profile);
        EditText name = findViewById(R.id.one1);
        EditText add = findViewById(R.id.editTextRRAddress);
        EditText username = findViewById(R.id.editTextRRUsername);
        EditText password = findViewById(R.id.editTextRRPassword);

        Button regBtn = findViewById(R.id.buttonRRegister);

        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewProfileController regController = new ViewProfileController();
                regController.updateProfile(name.toString(),add.toString(),password.toString(),username.toString());
                Toast.makeText(getApplicationContext(), "Successfully Update!!!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
