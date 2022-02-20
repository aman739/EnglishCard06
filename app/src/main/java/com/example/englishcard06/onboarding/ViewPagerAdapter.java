package com.example.englishcard06.onboarding;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.englishcard06.databinding.FragmentOnboardBinding;

import java.util.ArrayList;

public class ViewPagerAdapter extends RecyclerView.Adapter<ViewPagerAdapter.ViewPagerHolder> {
    ArrayList<ViewPagerModel> listPager;
    OnClickLIstener listener;

    public ViewPagerAdapter(ArrayList<ViewPagerModel> listPager, OnClickLIstener listener) {
        this.listPager = listPager;
        this.listener = listener;

    }

    public ViewPagerAdapter(ArrayList<ViewPagerModel> list) {
    }

    @NonNull
    @Override
    public ViewPagerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewPagerHolder(FragmentOnboardBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewPagerHolder holder, int position) {
        holder.onBind(listPager.get(position));
    }

    @Override
    public int getItemCount() {
        return listPager.size();
    }

    public class ViewPagerHolder extends  RecyclerView.ViewHolder {
        private FragmentOnboardBinding binding;

        public ViewPagerHolder(@NonNull FragmentOnboardBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(ViewPagerModel model) {


            binding.dotsIndicator.setDotIndicatorColor();
        }}

}

//            binding.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    listener.itemClick();
//                }
//            });