package com.example.dhaka_metro_rail;

/**
 * search friend model class
 */
public class SearchFriendController {
    private String user;
    private  String location;

    public java.lang.String getLocation() {
        return location;
    }

    public void setLocation(java.lang.String location) {
        this.location = location;
    }

    Set<SearchFriendController> friendList;

    public java.lang.String getUser() {
        return user;
    }

    public void setUser(java.lang.String user) {
        this.user = user;
    }

    public Set<SearchFriendController> getFriendList() {
        return friendList;
    }

    public void setFriendList(Set<SearchFriendController> friendList) {
        this.friendList = friendList;
    }
}
