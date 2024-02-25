package com.example.dhaka_metro_rail;

/**
 * test class for implementing register action
 */
public class RegUnitTest {

    public void testOneRegAction(){
        String name = "wasif";
        String add = "Dhaka";
        String userName = "wasif1";
        String pass = "123";
        RegController regController = new RegController();
        regController.regUser(name,add,userName,pass);
        RegModel regModel = new RegModel();
        String extractName = regModel.getName();
        String extractAddress = regModel.getAddress();
        String extractUserName = regModel.getUserName();
        String extractPass = regModel.getPassword();
        if(extractUserName.equals(userName) && extractPass.equals(pass)){
            throw new AssertionError("Test-1 Passed");
        }
        else{
            throw new AssertionError("Test-1 Failed");
        }
    }

}
