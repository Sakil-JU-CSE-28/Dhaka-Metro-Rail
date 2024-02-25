package com.example.dhaka_metro_rail;

/**
 * is for unit testing and follow tdd using refactoring
 */
public class SearchFriendUnitTest {
    /**
     * first test case to implement and test basic functionality
     * of Search friend feature. Under this feature one user after
     * registered into the system can find friend, if the location of
     * both person is in the same metro rail
     * search friend feature is implement through refactoring
     */

    public void testOneOfSearchFriend(){
        SearchFriendController searchFriendController = new SearchFriendController();
        Set<String> namesSet = new HashSet<>();
        namesSet.add("Alice");
        namesSet.add("Bob");
        namesSet.add("Charlie");
        namesSet.add("David");
        namesSet.add("Eve");

        Set<SearchFriendModel> extracted = searchFriendController.friendInThisMetro("23.27");
        if(extracted.size() < namesSet.size()){
            throw new AssertionError("Test-1 Passed");
        }
        else{
            throw new AssertionError("Test-1 failed");
        }
    }
}
