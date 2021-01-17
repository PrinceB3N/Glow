package com.example.glow.tutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.glow.MainActivity;
import com.example.glow.R;

public class Final extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test6);
        Button i = findViewById(R.id.button12);
        i.setOnClickListener(this);
    }
    @Override
    public void onClick(View view)
    {
        Intent myIntent = new Intent(this, MainActivity.class);
        this.startActivity(myIntent);
    }
}
