package com.example.glow.ui.utility;

import android.content.Context;

import com.google.gson.GsonBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Profile {
    String image; //Placeholder for image url
    String name;
    int age;
    HashMap<String, String> scans;
    HashMap<String, Boolean> ingredient;
    HashMap<String, Boolean> skincond;
    HashMap<String, Boolean> skintype;
    //ArrayList<Product> products;
    public Profile(){
        image = "test";
        name = "test";
        age = -1;
        scans = new HashMap<>();
        scans.put("ing1","bad");
        ingredient = new HashMap<>();
        skincond = new HashMap<>();
        skintype = new HashMap<>();

    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
}
