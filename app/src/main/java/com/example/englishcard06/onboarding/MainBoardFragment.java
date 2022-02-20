package com.example.englishcard06.onboarding;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.navigation.Navigation;

import com.example.englishcard06.R;
import com.example.englishcard06.base.BaseFragment;
import com.example.englishcard06.client.ViewPagerClient;
import com.example.englishcard06.databinding.FragmentMainBoardBinding;

public class MainBoardFragment extends BaseFragment<FragmentMainBoardBinding> {


    @Override
    public FragmentMainBoardBinding bind() {
        return FragmentMainBoardBinding.inflate(getLayoutInflater());
    }

    private void checkOnShow() {
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
        boolean isShow = sharedPreferences.getBoolean("isShow", false);
        if (isShow)
            Navigation.findNavController(requireView()).navigate(R.id.categoryFragment);
    }

    private void getData() {
        list = ViewPagerClient.getPagerList();
        adapter = new ViewPagerAdapter(list);
        binding.viewpager.setAdapter(adapter);
        binding.dotsIndicator.setViewPager2(binding.viewpager);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}