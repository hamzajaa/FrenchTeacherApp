package com.example.frenchteacherapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.IllegalFormatCodePointException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonBlack, buttonGreen, buttonPurple, buttonRed, buttonYellow;

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

        buttonBlack.setOnClickListener(this);
        buttonGreen.setOnClickListener(this);
        buttonPurple.setOnClickListener(this);
        buttonRed.setOnClickListener(this);
        buttonYellow.setOnClickListener(this);

//        buttonBlack.setOnClickListener(v -> {
//            MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.black);
//            mediaPlayer.start();
//        });
//
//        buttonGreen.setOnClickListener(v -> {
//            MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.green);
//            mediaPlayer.start();
//        });
//
//        buttonPurple.setOnClickListener(v -> {
//            MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.purple);
//            mediaPlayer.start();
//        });
//
//        buttonRed.setOnClickListener(v -> {
//            MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.red);
//            mediaPlayer.start();
//        });
//
//        buttonYellow.setOnClickListener(v -> {
//            MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.yellow);
//            mediaPlayer.start();
//        });

    }


    public void playSound(int sound) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, sound);
        mediaPlayer.start();
    }

    @Override
    public void onClick(View v) {
        int clickedId = v.getId();
        if (clickedId == R.id.buttonBlack) {
            playSound(R.raw.black);
        } else if (clickedId == R.id.buttonGreen) {
            playSound(R.raw.green);
        } else if (clickedId == R.id.buttonPurple) {
            playSound(R.raw.purple);
        } else if (clickedId == R.id.buttonRed) {
            playSound(R.raw.red);
        } else if (clickedId == R.id.buttonYellow) {
            playSound(R.raw.yellow);
        }

    }
}