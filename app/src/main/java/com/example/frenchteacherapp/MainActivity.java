package com.example.frenchteacherapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button buttonBlack;
    Button buttonGreen;
    Button buttonPurple;
    Button buttonRed;
    Button buttonYellow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        buttonBlack = findViewById(R.id.buttonBlack);
        buttonGreen = findViewById(R.id.buttonGreen);
        buttonPurple = findViewById(R.id.buttonPurple);
        buttonRed = findViewById(R.id.buttonRed);
        buttonYellow = findViewById(R.id.buttonYellow);

        buttonBlack.setOnClickListener(v -> {
            MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.black);
            mediaPlayer.start();
        });

        buttonGreen.setOnClickListener(v -> {
            MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.green);
            mediaPlayer.start();
        });

        buttonPurple.setOnClickListener(v -> {
            MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.purple);
            mediaPlayer.start();
        });

        buttonRed.setOnClickListener(v -> {
            MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.red);
            mediaPlayer.start();
        });

        buttonYellow.setOnClickListener(v -> {
            MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.yellow);
            mediaPlayer.start();
        });

    }
}