package com.example.glow.ui.scanner;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ScannerViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ScannerViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is scanner fragment");
        DatabaseReference mDatabase;
// ...
        mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase.child("test").push().setValue("updated");
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                System.out.println(dataSnapshot.exists());
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("error");
            }
        });
    }

    public LiveData<String> getText() {
        return mText;
    }
}