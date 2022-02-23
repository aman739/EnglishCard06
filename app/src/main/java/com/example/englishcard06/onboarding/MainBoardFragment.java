package com.example.englishcard06.onboarding;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.englishcard06.PreferenceManager;
import com.example.englishcard06.R;
import com.example.englishcard06.client.ViewPagerClient;
import com.example.englishcard06.databinding.FragmentMainBoardBinding;

import java.util.ArrayList;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainBoardFragment extends Fragment implements OnClickLIstener {

    private FragmentMainBoardBinding binding;
    ViewPagerAdapter adapter;
    ArrayList<ViewPagerModel> list = new ArrayList<>();

    @Inject
    PreferenceManager preferences;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentMainBoardBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getData();
        checkOnShow();
    }

    public void checkOnShow() {
        if (preferences.getBoolean()) {
            Navigation.findNavController(requireView()).navigate(R.id.wordsFragment);
        } else {
            preferences.setBoolean(false);
        }
    }

    private void getData() {
        list = ViewPagerClient.getPagerList();
        adapter = new ViewPagerAdapter(list, this);
        binding.viewPager.setAdapter(adapter);
        binding.dotsIndicator.setViewPager2(binding.viewPager);
    }

    @Override
    public void itemClick() {
        preferences.setBoolean(true);
        Navigation.findNavController(requireView()).navigate(R.id.wordsFragment);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}