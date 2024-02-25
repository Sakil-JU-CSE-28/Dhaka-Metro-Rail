package com.example.dhaka_metro_rail;

/**
 * model class which extract data from
 * database and return info to controller
 * class
 */
public class ProfileModel {
    private String name;
    private String address;
    private String userName;
    private String password;

    public ProfileModel() {
    }

    public ProfileModel(String name, String address, String userName, String password) {
        this.name = name;
        this.address = address;
        this.userName = userName;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean authPassword(String userName,String password){
        if(userName.equals(this.userName) && password.equals(this.password))
            return true;
        return false;
    }
}
