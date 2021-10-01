package com.techelevator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Customer extends Person implements Billable {

    private String phoneNumber;
    private List<Pet> pets = new ArrayList<>();

    public Customer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Customer(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public double getBalanceDue(Map<String, Double> servicesRendered) {
        double balanceDue = 0.0;
        Collection<Double> charges = servicesRendered.values();
        for( Double charge : charges) {
            balanceDue += charge.doubleValue();
        }
        return balanceDue;
    }




}
