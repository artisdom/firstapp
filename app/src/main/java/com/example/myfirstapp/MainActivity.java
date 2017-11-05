package com.example.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void radioClick(View view) {
        ImageView img = findViewById(R.id.turtle_image);

        int id = view.getId();
        if (id == R.id.button1) {
            img.setImageResource(R.drawable.image1);
        } else if (id == R.id.button2) {
            img.setImageResource(R.drawable.image2);
        } else if (id == R.id.button3) {
            img.setImageResource(R.drawable.image3);
        } else if (id == R.id.button4) {
            img.setImageResource(R.drawable.image4);
        } else if (id == R.id.button5) {
            img.setImageResource(R.drawable.image5);
        } else if (id == R.id.button6) {
            img.setImageResource(R.drawable.image6);
        } else if (id == R.id.button7) {
            img.setImageResource(R.drawable.image7);
        } else if (id == R.id.button8) {
            img.setImageResource(R.drawable.image8);
        } else if (id == R.id.button9) {
            img.setImageResource(R.drawable.image9);
        }
    }
}
