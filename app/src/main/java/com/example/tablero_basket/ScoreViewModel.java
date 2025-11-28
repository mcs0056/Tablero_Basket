package com.example.tablero_basket;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ScoreViewModel extends ViewModel {

    private final MutableLiveData<Integer> localScore = new MutableLiveData<>(0);
    private final MutableLiveData<Integer> visitanteScore = new MutableLiveData<>(0);

    public MutableLiveData<Integer> getLocalScore(){
        return localScore;
    }

    public MutableLiveData<Integer> getVisitanteScore() {
        return visitanteScore;
    }

    public void addLocal(int value){
        localScore.setValue(Math.max(0, localScore.getValue() + value));
    }

    public void addVis(int value){
        visitanteScore.setValue(Math.max(0, visitanteScore.getValue() + value));
    }
    public void reset(){
        localScore.setValue(0);
        visitanteScore.setValue(0);
    }
}
