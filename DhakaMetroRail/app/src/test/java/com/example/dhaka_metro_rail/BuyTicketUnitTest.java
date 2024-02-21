package com.example.dhaka_metro_rail;

import static org.junit.Assert.assertEquals;

import android.content.Context;
import android.widget.Spinner;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for the BuyTicket activity.
 */
public class BuyTicketUnitTest {
    private Spinner mockSpinnerTicketType;
    private Spinner mockSpinnerTicketQuantity;
    private Spinner mockSpinnerStartingStation;
    private Spinner mockSpinnerEndingStation;
    private BuyTicket buyTicketActivity;

    /**
     * Set up the test environment by initializing mock Spinners and injecting them into the activity.
     */
    @Before
    public void setUp() {
        // Initialize mock Spinners
        mockSpinnerTicketType = new MockSpinner(mockSpinnerTicketQuantity.getContext());
        mockSpinnerTicketQuantity = new MockSpinner(mockSpinnerTicketQuantity.getContext());
        mockSpinnerStartingStation = new MockSpinner(mockSpinnerTicketQuantity.getContext());
        mockSpinnerEndingStation = new MockSpinner(mockSpinnerTicketQuantity.getContext());

        // Inject mock Spinners into the activity
        buyTicketActivity = new BuyTicket();
        buyTicketActivity.setSpinnerTicketType(mockSpinnerTicketType);
        buyTicketActivity.setSpinnerTicketQuantity(mockSpinnerTicketQuantity);
        buyTicketActivity.setSpinnerStartingStation(mockSpinnerStartingStation);
        buyTicketActivity.setSpinnerEndingStation(mockSpinnerEndingStation);
    }

    /**
     * Test method to verify the retrieval of selected values from Spinners.
     */
    @Test
    public void testSpinnerSelections() {
        // Set selected values for the Spinners
        ((MockSpinner) mockSpinnerTicketType).setSelectedItem("Single Journey");
        ((MockSpinner) mockSpinnerTicketQuantity).setSelectedItem("2");
        ((MockSpinner) mockSpinnerStartingStation).setSelectedItem("Station A");
        ((MockSpinner) mockSpinnerEndingStation).setSelectedItem("Station B");

        // Call the method to retrieve selected values
        String selectedTicketType = String.valueOf(buyTicketActivity.getSelectedTicketType());
        Spinner selectedTicketQuantity = buyTicketActivity.getSelectedTicketQuantity();
        String selectedStartingStation = String.valueOf(buyTicketActivity.getSelectedStartingStation());
        String selectedEndingStation = String.valueOf(buyTicketActivity.getSelectedEndingStation());

        // Assert the expected values
        assertEquals("Single Journey", selectedTicketType);
        assertEquals(2, selectedTicketQuantity);
        assertEquals("Station A", selectedStartingStation);
        assertEquals("Station B", selectedEndingStation);
    }

    /**
     * Inner class representing a mock Spinner.
     */
    private class MockSpinner extends Spinner {
        private Object selectedItem;

        /**
         * Constructor for MockSpinner.
         * @param context The context.
         */
        public MockSpinner(Context context) {
            super(context);
        }

        /**
         * Setter for selected item.
         * @param item The item to set as selected.
         */
        public void setSelectedItem(Object item) {
            selectedItem = item;
        }

        /**
         * Overridden method to get selected item.
         * @return The selected item.
         */
        @Override
        public Object getSelectedItem() {
            return selectedItem;
        }
    }
}