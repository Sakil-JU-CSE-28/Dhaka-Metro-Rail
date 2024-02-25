package com.example.dhaka_metro_rail;

import org.junit.Test;

/**
 * test class for tdd of Indanger
 */
public class InDangerUnitTest {

    public void InDangerTest1(){
        InDangerController inDangerController = new InDangerController();
        inDangerController.makePhoneCall();

        inDangerController.savedCaller("anik","25-02-2024");
        InDangerModel inDangerModel = new InDangerModel();
        if(inDangerModel.getCaller().equals("anik") && inDangerModel.getCallTime().equals("25-02-2024")){
            throw new AssertionError("Test-1 Passed");
        }
        else{
            throw new AssertionError("Test-1 Failed");
        }
    }
}
