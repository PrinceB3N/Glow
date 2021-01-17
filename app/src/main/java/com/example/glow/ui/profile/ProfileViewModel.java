package com.example.glow.ui.profile;

import android.net.Uri;
import android.os.Build;
import android.util.JsonReader;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.glow.ui.utility.Profile;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.storage.StorageReference;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;

public class ProfileViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private static final String file_name = "userdata.json";
    private File file_dir;
    Gson gson;
    public ProfileViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is profile fragment");
    }
    void setFile_name(File file_dir) {

        this.file_dir = file_dir;
        File f = new File(file_dir, file_name);
        System.out.println(f.toString());
        GsonBuilder g = new GsonBuilder();
        g.setPrettyPrinting();
        gson = g.create();
        try {
            if (f.createNewFile()) {
                Profile p = new Profile();
                String json = gson.toJson(p);
                Writer writer = new FileWriter(f);
                writer.write(json);
                writer.flush();
                writer.close();
            } else {
                Reader read = new FileReader(f);
                Profile p = gson.fromJson(read, Profile.class);

            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public LiveData<String> getText() {
        return mText;
    }
}