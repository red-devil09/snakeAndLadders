package org.example.model;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {

    private int minvalue;
    private int maxValue;

    public Dice(int min,int max){
        this.maxValue = max;
        this.minvalue = min;
    }

    public int rollDice(){
        return ThreadLocalRandom.current().nextInt(minvalue,maxValue);
    }


}
