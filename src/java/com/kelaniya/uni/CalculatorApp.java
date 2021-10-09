package com.kelaniya.uni;


import com.kelaniya.uni.calculation.Calculation;
import com.kelaniya.uni.calculation.CalculationFactory;
import com.kelaniya.uni.input.Inputs;
import com.kelaniya.uni.repository.EmployeeRepository;
import com.kelaniya.uni.ui.UI;

import java.util.ArrayList;

public class CalculatorApp {

    private final Inputs inputs;
    private final UI ui;
    private final EmployeeRepository employeeRepository;
    private final CalculationFactory calculationFactory;

    public CalculatorApp(Inputs inputs, UI ui, EmployeeRepository employeeRepository, CalculationFactory calculationFactory) {
        this.inputs = inputs;
        this.ui = ui;
        this.employeeRepository = employeeRepository;
        this.calculationFactory = calculationFactory;
    }

    public void execute() {

        int id  = Integer.parseInt(inputs.getId());
        ArrayList<String> list = employeeRepository.getEmployeesPosition(id);
        Calculation calculation = calculationFactory.getInstance(list.get(1));
        int result = calculation.execute(Double.parseDouble(list.get(2)));
        ui.showMessage("The result is " + result);


    }

}
