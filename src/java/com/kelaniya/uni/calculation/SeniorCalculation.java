package com.kelaniya.uni.calculation;

public class SeniorCalculation implements Calculation {

    public int execute(Double experience) {
        if(experience>=1){
            return ((int)(20 + (experience * 2)));
        } else {
            return 20;
        }
    }
}
