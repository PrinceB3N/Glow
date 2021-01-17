package com.example.glow.tutorial;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.glow.R;

public class Ingredients extends AppCompatActivity {
    boolean first = false;
    boolean second = false;
    boolean third = false;
    boolean fourth = false;
    boolean fifth = false;
    boolean sixth = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test3);
        ImageView i = findViewById(R.id.imageView3);
    }
    void transition(View view) {
        boolean state = false;
        switch(view.getId()){
            case R.id.button6:
                first = !first;
                state =first;
                break;
            case R.id.button7:
                second = !second;
                state =second;
                break;
            case R.id.button8:
                third = !third;
                state =third;
                break;
            case R.id.button9:
                fourth = !fourth;
                state =fourth;
                break;
            case R.id.button10:
                fifth = !fifth;
                state = fifth;
                break;
            case R.id.button11:
                sixth = !sixth;
                state = sixth;
                break;
            case R.id.button3:
                Intent myIntent = new Intent(this, Final.class);
                this.startActivity(myIntent);
                return;
        }
        if(state) {
            view.setBackgroundColor(Color.TRANSPARENT);
            view.setAlpha(0f);
        }
        else{
            view.setBackgroundColor(Color.LTGRAY);
            view.setAlpha(0.5f);
        }
}
