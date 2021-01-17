package com.example.glow.ui.utility;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Utility {
    private final static String filename = "userdata";
    private File file;
    private Gson gson;
    Utility(Context context) {
        file = new File(context.getFilesDir(), filename);
        GsonBuilder g = new GsonBuilder();
        g.setPrettyPrinting();
        gson = g.create();
        try (Reader reader = new FileReader("c:\\test\\staff.json")) {

            // Convert JSON File to Java Object
            Profile p = gson.fromJson(reader, Profile.class);
            System.out.println(p);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
