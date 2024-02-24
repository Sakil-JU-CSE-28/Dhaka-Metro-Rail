package com.example.dhaka_metro_rail;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * reg view class
 */
public class RegViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_view);
        EditText name = findViewById(R.id.one);
        EditText add = findViewById(R.id.editTextRAddress);
        EditText username = findViewById(R.id.editTextRUsername);
        EditText password = findViewById(R.id.editTextRPassword);

        Button regBtn = findViewById(R.id.buttonRRegister);

        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RegController regController = new RegController();
                regController.regUser(name.toString(),add.toString(),username.toString(),password.toString());
                Toast.makeText(getApplicationContext(), "Successfully Registered!!!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}