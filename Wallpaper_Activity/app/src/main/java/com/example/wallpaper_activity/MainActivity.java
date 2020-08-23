package com.example.wallpaper_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.io.InputStream;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    ImageView imageView1,imageView2,imageView3,imageView4,imageView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = findViewById(R.id.wallpaper1);
        imageView2 = findViewById(R.id.wallpaper2);
        imageView3 = findViewById(R.id.wallpaper3);
        imageView4 = findViewById(R.id.wallpaper4);
        imageView5 = findViewById(R.id.wallpaper5);


        final String[] url = {
                "https://www.setaswall.com/wp-content/uploads/2019/08/Whatsapp-Wallpaper-102.jpg",
                "https://www.setaswall.com/wp-content/uploads/2019/08/Whatsapp-Wallpaper-111-380x676.jpg",
                "https://www.setaswall.com/wp-content/uploads/2019/08/Whatsapp-Wallpaper-112-380x676.jpg",
                "https://www.setaswall.com/wp-content/uploads/2019/08/Whatsapp-Wallpaper-072-380x676.jpg",
                "https://www.setaswall.com/wp-content/uploads/2019/08/Whatsapp-Wallpaper-001-380x676.jpg"
        };

        //new DownloadImage(imageView).execute(url);
        Picasso.get().load(url[0]).into(imageView1);
        Picasso.get().load(url[1]).into(imageView2);
        Picasso.get().load(url[2]).into(imageView3);
        Picasso.get().load(url[3]).into(imageView4);
        Picasso.get().load(url[4]).into(imageView5);


        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, SetWallpaper.class);
                intent.putExtra("imageURL",url[0]);
                startActivity(intent);

            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, SetWallpaper.class);
                intent.putExtra("imageURL",url[1]);
                startActivity(intent);

            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, SetWallpaper.class);
                intent.putExtra("imageURL",url[2]);
                startActivity(intent);

            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, SetWallpaper.class);
                intent.putExtra("imageURL",url[3]);
                startActivity(intent);

            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, SetWallpaper.class);
                intent.putExtra("imageURL",url[4]);
                startActivity(intent);

            }
        });

    }

    /*class DownloadImage extends AsyncTask<String,Void, Bitmap>{

        ImageView imageView;

        DownloadImage(ImageView imageView){
            this.imageView =imageView;
        }
        @Override
        protected Bitmap doInBackground(String... strings) {
            String url = strings[0];
            Bitmap bitmap = null;
            try {
                InputStream inputStream = new URL(url).openStream();
                bitmap = BitmapFactory.decodeStream(inputStream);

            }
            catch (Exception e){

            }
            return bitmap;
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            imageView.setImageBitmap(bitmap);
        }
    }*/


}