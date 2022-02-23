package com.example.englishcard06.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.englishcard06.R;
import com.example.englishcard06.databinding.FragmentMainBoardBinding;

import javax.annotation.Nullable;

import dagger.hilt.android.AndroidEntryPoint;

public class CategoryFragment extends Fragment {
    public FragmentMainBoardBinding bind() {
        return FragmentMainBoardBinding.inflate(getLayoutInflater());
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    }
