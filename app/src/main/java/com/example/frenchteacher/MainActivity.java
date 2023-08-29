package com.example.frenchteacher;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.media.MicrophoneDirection;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialDialogs;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button blackButton, greenButton, yellowButton, redButton, purpleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blackButton = findViewById(R.id.blackBtn);
        greenButton = findViewById(R.id.greenBtn);
        purpleButton = findViewById(R.id.purpleBtn);
        yellowButton = findViewById(R.id.yellowBtn);
        redButton = findViewById(R.id.redBtn);
        
        blackButton.setOnClickListener(this);
        greenButton.setOnClickListener(this);
        purpleButton.setOnClickListener(this);
        yellowButton.setOnClickListener(this);
        redButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int clickedBtnId = view.getId();

        if(clickedBtnId == R.id.blackBtn){
            playSounds(R.raw.black,"noire");
        } else if (clickedBtnId == R.id.greenBtn) {
            playSounds(R.raw.green,"verte");
        } else if (clickedBtnId == R.id.purpleBtn) {
            playSounds(R.raw.purple,"violet");
        } else if (clickedBtnId == R.id.yellowBtn) {
            playSounds(R.raw.yellow, "jaune");
        } else if (clickedBtnId == R.id.redBtn) {
            playSounds(R.raw.red,"rouge");
        }
    }

   public void playSounds(int id, String text){
       MediaPlayer mediaplayer = new MediaPlayer().create(
               this,
               id
       );
       mediaplayer.start();

       Toast.makeText(
               this,
               text,
               Toast.LENGTH_SHORT
       ).show();
   }
}