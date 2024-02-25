package com.example.dhaka_metro_rail;

/**
 * class for controlling view profile views
 * activity using model
 */
public class ViewProfileController {
    /**
     * method for extracting profile info
     * from model
     */

    public ProfileModel getProfile(String userName,String password){
        ProfileModel profile = new ProfileModel();
        profile.setName(profile.getName());
        profile.setAddress(profile.getAddress());
        return profile;
    }

    /**
     * method for changing user info
     */

    public boolean changePassword(String userName,String oldPassword,String newPassword){
        ProfileModel profile = new ProfileModel();
        if(profile.authPassword(userName,oldPassword)){
            profile.setPassword(newPassword);
            return true;
        }
        return false;
    }

    public boolean updateProfile(String name,String address,String password,String user){
        ProfileModel profileModel = new ProfileModel();
        if(profileModel.authPassword(user,password)){
            profileModel.setName(name);
            profileModel.setAddress(address);
            return true;
        }
        return false;
    }

}
