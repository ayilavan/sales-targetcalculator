package com.kelaniya.uni.calculation;

public class JuniorCalculation implements Calculation{

    public int execute(Double experience) {
        if(experience>=1){
            return ((int)(15 + (experience * 2)));
        } else {
            return 15;
        }
    }
}
