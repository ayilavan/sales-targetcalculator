package com.kelaniya.uni;

import com.kelaniya.uni.calculation.CalculationFactory;
import com.kelaniya.uni.input.CommandLineInputs;
import com.kelaniya.uni.input.Inputs;
import com.kelaniya.uni.repository.EmployeeRepository;
import com.kelaniya.uni.repository.SalesEmployeeRepository;
import com.kelaniya.uni.ui.CmdLineUI;
import com.kelaniya.uni.ui.UI;


public class Main {
    public static void main(String[] args) {
        Inputs inputs = new CommandLineInputs(args);
        EmployeeRepository employeeRepository = new SalesEmployeeRepository();
        CalculationFactory calculationFactory = new CalculationFactory();
        UI ui = new CmdLineUI();

        CalculatorApp app = new CalculatorApp(inputs, ui,employeeRepository, calculationFactory);
        app.execute();
    }
}
