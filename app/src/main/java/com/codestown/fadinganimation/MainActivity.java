package com.codestown.fadinganimation;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
//fading animation project

    boolean baby1showing = true;

    public void fade(View view) {

        ImageView baby1ImageView = findViewById(R.id.baby1ImageView);
        ImageView baby2ImageView = findViewById(R.id.baby2ImageView);
//        if (baby1showing) {
//            baby1showing = false;
//            baby1ImageView.animate().alpha(0).setDuration(2000);
//            baby2ImageView.animate().alpha(1).setDuration(2000);
//        }else{
//            baby1showing = true;
//            baby1ImageView.animate().alpha(1).setDuration(2000);
//            baby2ImageView.animate().alpha(0).setDuration(2000);
//        }
        //baby1ImageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
        //baby1ImageView.animate().scaleXBy(0.5f).scaleYBy(0.5f).setDuration(2000);
        //baby1ImageView.animate().translationXBy(-10000).setDuration(2000);
        baby1ImageView.animate().rotation(1800).scaleYBy(0.5f).scaleXBy(0.5f).setDuration(2000);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}