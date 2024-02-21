package com.example.dhaka_metro_rail;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ViewMetroUnitTest {
    private MetroExtractor metroExtractor;
    private Metro metro;

    @Before
    public void setUp() {
        // Initialize a new Metro object before each test
        metroExtractor = new MetroExtractor();
        metro = new Metro();
    }

    @Test
    public void testGetComments_EmptyList() {
        // Arrange
        List<String> expectedComments = metro.getComments();

        // Act
        List<String> actualComments = metroExtractor.getComments();

        // Assert
        assertEquals(expectedComments, actualComments);
    }

    @Test
    public void testAddComments() {
        // Arrange
        String comment1 = "First comment";
        String comment2 = "Second comment";

        // Act
        metroExtractor.addComments(comment1);
        metroExtractor.addComments(comment2);

        // Assert
        List<String> expectedComments = metro.getComments();
        expectedComments.add(comment1);
        expectedComments.add(comment2);
        assertEquals(expectedComments, metroExtractor.getComments());
    }
}
