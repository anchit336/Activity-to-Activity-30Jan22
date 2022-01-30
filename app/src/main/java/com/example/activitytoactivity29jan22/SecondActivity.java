package com.example.activitytoactivity29jan22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.activitytoactivity29jan22.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent i = getIntent();

        String userName = i.getStringExtra("name");
        String userEmail = i.getStringExtra("email");
        int userPhone = i.getIntExtra("phone", 0);

        binding.textViewName.setText("Hello " + userName);
        binding.textViewEmail.setText("Your email address id " + userEmail);
        binding.textViewPhone.setText("Your phone number is " + String.valueOf(userPhone));
    }
}