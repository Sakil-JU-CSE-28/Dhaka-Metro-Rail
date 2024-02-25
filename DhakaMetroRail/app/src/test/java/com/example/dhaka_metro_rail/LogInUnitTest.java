package com.example.dhaka_metro_rail;

/**
 * test class for conducting test driven developement
 */
public class LogInUnitTest {

    /**
     * test case for implementing login
     */

     public void testCaseOneLogIn(){
         LogInController logInController = new LogInController();
         if(logInController.isValid("12345","liton")){
             throw new AssertionError("Test-1 Passed");
         }
         else{
             throw new AssertionError("Test-1 Failed");
         }
     }

}
