package com.example.dhaka_metro_rail;

/**
 * reg controller class
 */
public class RegController {

    public void regUser(String name,String address,String userName,String password){
        RegModel regModel = new RegModel(name,address,userName,password);
    }

}
