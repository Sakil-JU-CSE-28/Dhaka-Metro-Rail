package com.example.dhaka_metro_rail;

import org.junit.Test;

/**
 * test class for tdd of Indanger
 */
public class InDangerUnitTest {

    public void InDangerTest1(){
        InDangerController inDangerController = new InDangerController();

        try {
            inDangerController.makePhoneCall("999");
            // If the method call does not throw an exception, the test passed
            throw new AssertionError("Test-1 Passed");
        } catch (SecurityException e) {
            // If a SecurityException is caught, it indicates the test failed
            throw new AssertionError("Test-1 Failed: SecurityException caught");
        }
    }
}
