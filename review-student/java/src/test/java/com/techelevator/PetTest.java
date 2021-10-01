package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PetTest {

    @Test
    public void listVaccinations_return_comma_delimited_list(){
        Pet petTest = new Pet("Kevin", "cow");
        List<String> testList = new ArrayList<>();
        testList.add("rabies");
        testList.add("distemper");
        testList.add("parvo");
        petTest.setVaccinations(testList);
        Assert.assertEquals("rabies, distemper, parvo", petTest.listVaccinations());
    }

    @Test
    public void listVaccinations_return_empty_for_empty_list(){
        Pet petTest = new Pet("Kevin", "cow");
        List<String> testList = new ArrayList<>();
        petTest.setVaccinations(testList);
        Assert.assertEquals("", petTest.listVaccinations());
    }


}
