package com.example.englishcard06.onboarding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.englishcard06.databinding.FragmentOnBoardBinding;

import java.util.ArrayList;

public class ViewPagerAdapter extends RecyclerView.Adapter<ViewPagerAdapter.ViewPagerHolder> {
    ArrayList<ViewPagerModel> listPager;
    OnClickLIstener listener;

    public ViewPagerAdapter(ArrayList<ViewPagerModel> listPager, OnClickLIstener listener) {
        this.listPager = listPager;
        this.listener = listener;

    }

    @NonNull
    @Override
    public ViewPagerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewPagerHolder(FragmentOnBoardBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewPagerHolder holder, int position) {
        holder.onBind(listPager.get(position));
    }

    @Override
    public int getItemCount() {
        return listPager.size();
    }

    public class ViewPagerHolder extends RecyclerView.ViewHolder {
        private FragmentOnBoardBinding binding;

        public ViewPagerHolder(@NonNull FragmentOnBoardBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(ViewPagerModel model) {
                binding.tvTitle.setText(model.getTitle());
                binding.tvDesc.setText(model.getDescription());
                binding.imImage.setImageResource(model.getImage());
                binding.tvDesc.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        listener.itemClick();
                    }
                });
            }
        }
    }



