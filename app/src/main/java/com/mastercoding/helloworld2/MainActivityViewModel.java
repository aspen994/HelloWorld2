package com.mastercoding.helloworld2;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private int counter = 40;
    // Hello we making first change

    private MutableLiveData<Integer> countLiveData = new MutableLiveData<>();

    // When the app first launched
    public MutableLiveData<Integer> getInitialCounter(){
        countLiveData.setValue(counter);
        return countLiveData;
    }


    // When user clicks the button
    public void getCounter(){
        counter++;
        countLiveData.setValue(counter);
    }


}
