package com.example.glow.tutorial;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.fragment.app.Fragment;

import com.example.glow.R;

import java.util.ArrayList;

public class SkinCare extends AppCompatActivity {
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
    public void transition(View view) {
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
                Intent myIntent = new Intent(this, SkinType.class);
                this.startActivity(myIntent);
                return;
        }
        if(state) {
            view.setBackgroundColor(Color.TRANSPARENT);
            view.setAlpha(0f);
        }
        else{
            Drawable buttonDrawable = view.getBackground();
            buttonDrawable = DrawableCompat.wrap(buttonDrawable);
            DrawableCompat.setTint(buttonDrawable, Color.LTGRAY);
            view.setBackground(buttonDrawable);
            view.setAlpha(0.5f);
        }

    }
}
