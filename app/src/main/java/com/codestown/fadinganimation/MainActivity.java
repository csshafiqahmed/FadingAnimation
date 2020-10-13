package com.codestown.fadinganimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean baby1showing = true;
    public void fade(View view){

        ImageView baby1ImageView = findViewById(R.id.baby1ImageView);
        ImageView baby2ImageView = findViewById(R.id.baby2ImageView);
        if (baby1showing){
            baby1showing = false;
            baby1ImageView.animate().alpha(0).setDuration(2000);
            baby2ImageView.animate().alpha(1).setDuration(2000);
        }else{
            baby1showing = true;
            baby1ImageView.animate().alpha(1).setDuration(2000);
            baby2ImageView.animate().alpha(0).setDuration(2000);
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}