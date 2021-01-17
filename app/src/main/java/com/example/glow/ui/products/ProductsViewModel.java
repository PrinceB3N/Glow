package com.example.glow.ui.products;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.glow.ui.utility.Utility;

import java.io.File;

public class ProductsViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private File file_dir;
    public ProductsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is products fragment");
    }
    void setFile_name(File file_dir){
        this.file_dir = file_dir;
    }
    public LiveData<String> getText() {
        return mText;
    }
}