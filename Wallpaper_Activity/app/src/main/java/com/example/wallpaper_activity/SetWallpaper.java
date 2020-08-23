package com.example.wallpaper_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.IOException;

public class SetWallpaper extends AppCompatActivity {
     ImageView wallpaper;
     TextView setButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_wallpaper);
        wallpaper = findViewById(R.id.wallpaper);
        setButton = findViewById(R.id.set);

        String url = getIntent().getStringExtra("imageURL");

        Picasso.get().load(url).into(wallpaper);

        setButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Fetching bitmap
                wallpaper.buildDrawingCache();
                Bitmap bitmap = wallpaper.getDrawingCache();

                // Setting wallpaper
                WallpaperManager myWallpaperManager = WallpaperManager
                        .getInstance(getApplicationContext());
                try {
                    myWallpaperManager.setBitmap(bitmap);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });


    }
}