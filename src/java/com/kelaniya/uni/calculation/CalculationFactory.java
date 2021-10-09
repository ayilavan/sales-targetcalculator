package com.kelaniya.uni.calculation;

public class CalculationFactory {

        public Calculation getInstance(String position) {

            Calculation calculation = null;

            if(position.equals("SENIOR")){
                calculation = new SeniorCalculation();
            } else if(position.equals("JUNIOR")){
                calculation = new JuniorCalculation();
            } else if(position.equals("INTERN")){
                calculation = new InternCalculation();
            }
            return calculation;
        }
}
