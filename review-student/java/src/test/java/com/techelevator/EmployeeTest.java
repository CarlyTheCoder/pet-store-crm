package com.techelevator;

import com.techelevator.hr.Employee;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class EmployeeTest {

    @Test

    public void get_balance_due_returns_zero_for_no_charges(){
        Employee employee = new Employee("Bob", "Dylan");
        Map<String, Double> testCharges = new HashMap<>();
        Assert.assertEquals(0.0, employee.getBalanceDue(testCharges), 0.01);

    }
    @Test

    public void get_balance_due_returns_correct_balance(){
        Employee employee = new Employee("Bob", "Dylan");
        Map<String, Double> testCharges = new HashMap<>();
        testCharges.put("Brush", 32.0);
        testCharges.put("Walking", 20.0);
        Assert.assertEquals(42.0, employee.getBalanceDue(testCharges), 0.01);

    }

}