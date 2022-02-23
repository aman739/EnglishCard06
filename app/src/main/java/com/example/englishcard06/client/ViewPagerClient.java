package com.example.englishcard06.client;

import com.example.englishcard06.R;
import com.example.englishcard06.onboarding.ViewPagerModel;

import java.util.ArrayList;

public class ViewPagerClient {

    public static ArrayList<ViewPagerModel> pagerlist = new ArrayList<>();

    public static ArrayList<ViewPagerModel> getPagerList() {

        pagerlist.add(new ViewPagerModel("Categories", "Create your own categories for words", R.drawable.category_im));

        pagerlist.add(new ViewPagerModel("Words", "Create words in English and click on the card to see the translation and image for associations", R.drawable.words_im));

        pagerlist.add(new ViewPagerModel("Learning", "Swipe the card either to the right if you remembered it or to the left if you don't", R.drawable.study_im));

        pagerlist.add(new ViewPagerModel("Your profile", "Track your achievements and experience", R.drawable.profile));

        pagerlist.add(new ViewPagerModel("Let's get started!", "button", R.drawable.finish_im));
        return pagerlist;
    }
}
