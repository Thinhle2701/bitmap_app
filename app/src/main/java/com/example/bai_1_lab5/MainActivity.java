package com.example.bai_1_lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button click_event;
    ImageView imageView;
    AnimationDrawable anim;
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click_event = (Button) findViewById(R.id.button);
        imageView = (ImageView)findViewById(R.id.imageButton);
        imageView.setImageResource(R.drawable.iphone_improve);

        click_event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                anim = (AnimationDrawable) imageView.getDrawable();
                anim.start();

            }
        });





    }

    public void play(View v)
    {
        if (player == null)
        {
            player = MediaPlayer.create(this,R.raw.music_app);
        }
        player.start();
    }





}




