package com.example.dhaka_metro_rail;

import org.junit.Test;

/**
 * test class for tdd of Indanger
 */
public class InDangerUnitTest {

    public void InDangerTest1(){
        InDangerController inDangerController = new InDangerController(this);
        if(inDangerController.makePhoneCall("999")){
            throw new AssertionError("Test-1 Passed");
        }
        else{
            throw new AssertionError("Test-1 Failed");
        }
    }
}
