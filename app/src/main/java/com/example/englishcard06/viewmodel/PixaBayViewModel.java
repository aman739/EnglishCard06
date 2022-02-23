package com.example.englishcard06.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.englishcard06.PreferenceManager;
import com.example.englishcard06.network.model.Hits;
import com.example.englishcard06.repository.PixaBayRepository;

import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class PixaBayViewModel extends ViewModel {
    public MutableLiveData<List<Hits>> hitsMutableLiveData = new MutableLiveData<>();

    PixaBayRepository repository;

    @Inject
    public PixaBayViewModel(PixaBayRepository repository) {
        this.repository = repository;
    }

    public MutableLiveData<List<Hits>> getImages(String word) {
        repository.getImages(word);
        hitsMutableLiveData = repository.listImages;
        return hitsMutableLiveData;
    }
}