package com.example.dhaka_metro_rail;

/**
 * search friend controller class
 */
public class SearchFriendController {
    /**
     *
     * @param location
     * @return
     */
    Set<SearchFriendModel> friendInThisMetro(String location){
        SearchFriendModel searchFriendModel = new SearchFriendModel();
        Set<SearchFriendModel>al,inThisLoc;
        al = searchFriendModel.getFriendList();
        for(SearchFriendModel i : al){
            if(i.getLocation().equals(location))
                inThisLoc.add(i);
        }
        return inThisLoc;
    }
}
