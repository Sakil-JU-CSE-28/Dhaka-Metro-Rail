package com.example.dhaka_metro_rail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * login view class
 */
public class LogInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        EditText username = findViewById(R.id.editTextUsername);
        EditText password = findViewById(R.id.editTextPassword);
        Button logInBtn = findViewById(R.id.buttonLogin);
        Button regBtn = findViewById(R.id.buttonRegister);

        logInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LogInController logInController = new LogInController();
                if(logInController.isValid(password.toString(),username.toString())){
                    Toast.makeText(getApplicationContext(), "Your login was successful!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Your login Failed. Try again!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}