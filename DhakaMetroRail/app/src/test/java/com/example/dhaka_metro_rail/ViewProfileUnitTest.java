package com.example.dhaka_metro_rail;

/**
 * class for testing and developing viewprofile
 * feature where user can view his/her profile
 * information , can change password etc.
 */
public class ViewProfileUnitTest {

    /**
     * first test case to implement and test controller,view
     * model of viewprofile feature
     */
    public void testOneOfGetProfile(){
        ViewProfileController viewProfileController = new ViewProfileController();
        ProfileModel profile = viewProfileController.getProfile("sagor","1234");
        if(profile.getUserName().equals("sagor") && profile.getPassword().equals("1234")){
            throw new AssertionError("Test-1 Passed");
        }
        else{
            throw new AssertionError("Test-1 Failed");
        }
    }

    /**
     * test case for test and implement changePassword method
     */

    public void testOneOfChangePassword(){

        ViewProfileController viewProfileController = new ViewProfileController();
        viewProfileController.changePassword("sagor","1234","12345");
        ProfileModel profile = viewProfileController.getProfile("sagor","12345");
        if(profile.getUserName().equals("sagor") && profile.getPassword().equals("1234")){

            throw new AssertionError("Test-1 Passed");
        }
        else{
            throw new AssertionError("Test-1 Failed");
        }
    }

}
