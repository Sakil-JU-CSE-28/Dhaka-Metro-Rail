package com.example.dhaka_metro_rail;

import org.junit.Test;

public class BuyTicketUnitTest {
    public void buyTicketTest1(){
        BuyTicket buyTicket = new BuyTicket();
        if(buyTicket.buyTicket("Single Ride",1,"A","B") == -1){
            throw new AssertionError("Test-1 Failed");
        }
        else {
            throw new AssertionError("Test-1 Passed");
        }
    }
}
