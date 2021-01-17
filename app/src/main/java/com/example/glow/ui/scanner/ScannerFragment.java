package com.example.glow.ui.scanner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.glow.R;

public class ScannerFragment extends Fragment {

    private ScannerViewModel scanViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        scanViewModel =
                new ViewModelProvider(this).get(ScannerViewModel.class);
        View root = inflater.inflate(R.layout.fragment_scanner, container, false);
        return root;
    }
}