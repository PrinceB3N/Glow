package com.example.glow.tutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.glow.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Login extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test2);
        ImageView i = findViewById(R.id.imageView2);
        i.setOnClickListener(this);
    }
    @Override
    public void onClick(View view)
    {
        Intent myIntent = new Intent(this, SkinCare.class);
        this.startActivity(myIntent);
    }
}
