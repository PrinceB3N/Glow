package com.example.glow.tutorial;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.glow.R;

public class SkinType extends AppCompatActivity {
    boolean first = false;
    boolean second = false;
    boolean third = false;
    boolean fourth = false;
    boolean fifth = false;
    boolean sixth = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test4);
        ImageView i = findViewById(R.id.imageView4);
    }
    void transition(View view) {
        boolean state = false;
        switch (view.getId()) {
            case R.id.button13:
                first = !first;
                state = first;
                break;
            case R.id.button14:
                second = !second;
                state = second;
                break;
            case R.id.button15:
                third = !third;
                state = third;
                break;
            case R.id.button16:
                fourth = !fourth;
                state = fourth;
                break;
            case R.id.button17:
                fifth = !fifth;
                state = fifth;
                break;
            case R.id.button18:
                sixth = !sixth;
                state = sixth;
                break;
            case R.id.button4:
                Intent myIntent = new Intent(this, Ingredients.class);
                this.startActivity(myIntent);
                return;
        }
        if (state) {
            view.setBackgroundColor(Color.TRANSPARENT);
            view.setAlpha(0f);
        } else {
            view.setBackgroundColor(Color.LTGRAY);
            view.setAlpha(0.5f);
        }
    }
}
