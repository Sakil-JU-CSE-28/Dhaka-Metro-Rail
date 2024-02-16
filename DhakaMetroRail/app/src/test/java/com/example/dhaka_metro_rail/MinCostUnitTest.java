package com.example.dhaka_metro_rail;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.util.Optional;
/**
 * Unit tests for the MinCost class.
 */
public class MinCostUnitTest {
    private MinCost minCost;

    @Before
    public void setUp() {
        minCost = new MinCost();
    }
    /**
     * Tests the getRandomTime method to ensure it generates a random time within the specified range.
     */
    @Test
    public void testGetRandomTime() {
        // Test getRandomTime method to ensure it generates a random time within the specified range
        int randomTime = minCost.getRandomTime();
        assertTrue(randomTime >= 10 && randomTime <= 50);
    }

    /**
     * Tests the calculateShortestPathFromSource method to ensure it calculates the shortest path correctly.
     */
    @Test
    public void testCalculateShortestPathFromSource() {
        // Create a graph with known nodes and connections
        Graph graph = new Graph();
        Station stationA = new Station("A");
        Station stationB = new Station("B");
        Station stationC = new Station("C");
        Station stationD = new Station("D");
        stationA.addDestination(stationB, 10);
        stationA.addDestination(stationC, 15);
        stationB.addDestination(stationD, 12);
        stationC.addDestination(stationD, 10);
        graph.addNode(stationA);
        graph.addNode(stationB);
        graph.addNode(stationC);
        graph.addNode(stationD);

        // Calculate shortest path
        Graph resultGraph = MinCost.calculateShortestPathFromSource(graph, stationA);

        // Validate shortest paths
        assertEquals(Optional.of(0), stationA.getDistance());
        assertEquals(Optional.of(10), stationB.getDistance());
        assertEquals(Optional.of(15), stationC.getDistance());
        assertEquals(Optional.of(25), stationD.getDistance());

        // Validate shortest path nodes
        assertEquals(1, stationB.getShortestPath().size());
        assertEquals(2, stationC.getShortestPath().size());
        assertEquals(3, stationD.getShortestPath().size());

        // Ensure correct shortest path nodes
        assertEquals(stationA, stationB.getShortestPath().get(0));
        assertEquals(stationA, stationC.getShortestPath().get(0));
        assertEquals(stationC, stationD.getShortestPath().get(0));
    }

}
