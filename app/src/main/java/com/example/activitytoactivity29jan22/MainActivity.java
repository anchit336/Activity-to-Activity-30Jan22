package com.example.activitytoactivity29jan22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.activitytoactivity29jan22.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnSignUp.setOnClickListener(view -> {

            String userName = binding.editTextName.getText().toString();
            String userEmail = binding.editTextEmail.getText().toString();
            int userPhone = Integer.valueOf(binding.editTextPhone.getText().toString());

                Intent i = new Intent(MainActivity.this, SecondActivity.class);

                i.putExtra("name", userName);
                i.putExtra("email", userEmail);
                i.putExtra("phone", userPhone);

                startActivity(i);

        });
    }
}