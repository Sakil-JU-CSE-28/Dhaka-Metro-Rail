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
         logInController.isValid("12345","liton");
     }

}
