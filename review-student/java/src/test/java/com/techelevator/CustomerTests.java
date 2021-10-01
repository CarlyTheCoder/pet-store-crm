package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CustomerTests {

    @Test

    public void get_balance_due_returns_zero_for_no_charges(){
        Customer customer = new Customer("Bob", "Dylan");
        Map<String, Double> testCharges = new HashMap<>();
        Assert.assertEquals(0.0, customer.getBalanceDue(testCharges), 0.01);

    }
    @Test

    public void get_balance_due_returns_correct_balance(){
        Customer customer = new Customer("Bob", "Dylan");
        Map<String, Double> testCharges = new HashMap<>();
        testCharges.put("Brush", 32.0);
        testCharges.put("Walking", 20.0);
        Assert.assertEquals(52.0, customer.getBalanceDue(testCharges), 0.01);

    }

}
