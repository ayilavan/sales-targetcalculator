package com.kelaniya.uni.repository;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SalesEmployeeRepository implements EmployeeRepository{

    @Override
    public ArrayList<String> getEmployeesPosition(int id) {
        ArrayList<String> list = new ArrayList<String>();
        try {
            Scanner inputStream = new Scanner(new File("src/sales_person_records .csv"));
            String line = inputStream.nextLine();

            while(inputStream.hasNextLine()) {
                line = inputStream.nextLine();
                String[] array = line.split(",");
                int empId = Integer.parseInt(array[0]);
                if(empId == id) {
                    list.add(array[1]);
                    list.add(array[2]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}
