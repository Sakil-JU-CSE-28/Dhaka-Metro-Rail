package com.example.dhaka_metro_rail;

/**
 * login controller class
 */
public class LogInController {

    boolean isValid(String password,String userName){
        LogInModel checker = new LogInModel();
        if(checker.getPassword().equals(password) && checker.getUserName().equals(userName))
            return true;
        return false;
    }
}
