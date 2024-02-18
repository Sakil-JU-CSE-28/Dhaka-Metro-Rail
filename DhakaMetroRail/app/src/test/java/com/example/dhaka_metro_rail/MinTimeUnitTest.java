package com.example.dhaka_metro_rail;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Unit tests for the MinTime class.
 */

public class MinTimeUnitTest {
    private MinTime minTime;

    @Before
    public void setUp() {
        minTime = new MinTime();
    }

    /**
     * Tests the calculateShortestPathFromSource method of the MinTime class.
     */
    @Test
    public void testCalculateShortestPathFromSource() {
        // Create stations
        Station stationA = new Station();
        Station stationB = new Station();
        Station stationC = new Station();

        // Add stations to the graph
        Graph graph = new Graph();
        graph.addNode(stationA);
        graph.addNode(stationB);
        graph.addNode(stationC);

        // Define adjacency list
        Map<Station, Integer> adjacencyA = new HashMap<>();
        adjacencyA.put(stationB, 2);
        adjacencyA.put(stationC, 4);
        stationA.setAdjacentNodes(adjacencyA);

        Map<Station, Integer> adjacencyB = new HashMap<>();
        adjacencyB.put(stationC, 1);
        stationB.setAdjacentNodes(adjacencyB);

        // Calculate shortest path
        graph = MinTime.calculateShortestPathFromSource(graph, stationA);

        // Assert distances
        assertEquals(Optional.of(0), stationA.getDistance());
        assertEquals(Optional.of(2), stationB.getDistance());
        assertEquals(Optional.of(3), stationC.getDistance());
    }

    /**
     * Tests the getRandomTime method of the MinTime class.
     */
    @Test
    public void testGetRandomTime() {
        // Test getRandomTime() method
        int randomNumber = minTime.getRandomTime();
        assertTrue(randomNumber >= 1 && randomNumber <= 5);
    }
}
