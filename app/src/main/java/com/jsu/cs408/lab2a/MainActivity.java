package com.jsu.cs408.lab2a;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.jsu.cs408.lab2a.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private String[] mysteries;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        mysteries = getResources().getStringArray(R.array.mystery_strings);
    }

    public void clickedHelpButton(View v) {
        binding.output.setText(getRandomMystery());
    }

    private String getRandomMystery() {
        int rand = (int) Math.floor(Math.random() * mysteries.length);

        return mysteries[rand];
    }
}