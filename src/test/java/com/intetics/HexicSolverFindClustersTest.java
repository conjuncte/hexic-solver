package com.intetics;

import org.junit.Test;

import java.util.List;
import java.util.Set;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class HexicSolverFindClustersTest {

    private HexicSolver solver = new HexicSolver();

    @Test
    public void testEmptyCells() {
        List<Set<Integer>> clusters = solver.findClusters(solver.getCells());
        assertTrue(clusters.isEmpty());
    }

    @Test
    public void testIsolatedCells() {
        solver.getCells()[0][6] = 1;
        solver.getCells()[1][6] = 1;
        solver.getCells()[47][6] = 1;
        solver.getCells()[84][6] = 1;

        List<Set<Integer>> clusters = solver.findClusters(solver.getCells());
        assertTrue(clusters.isEmpty());
    }

    @Test
    public void testGroupedCluster() {
        solver.getCells()[0][6] = 1;
        solver.getCells()[10][6] = 1;
        solver.getCells()[5][6] = 1;

        List<Set<Integer>> clusters = solver.findClusters(solver.getCells());
        assertEquals(1, clusters.size());
        assertTrue(clusters.get(0).contains(0));
        assertTrue(clusters.get(0).contains(10));
        assertTrue(clusters.get(0).contains(5));
    }

    @Test
    public void testBigGroupedCluster() {
        solver.getCells()[0][6] = 1;
        solver.getCells()[6][6] = 1;
        solver.getCells()[1][6] = 1;
        solver.getCells()[11][6] = 1;
        solver.getCells()[21][6] = 1;
        solver.getCells()[26][6] = 1;
        solver.getCells()[20][6] = 1;
        solver.getCells()[25][6] = 1;
        solver.getCells()[30][6] = 1;
        solver.getCells()[40][6] = 1;
        solver.getCells()[50][6] = 1;
        solver.getCells()[56][6] = 1;
        solver.getCells()[61][6] = 1;
        solver.getCells()[67][6] = 1;
        solver.getCells()[57][6] = 1;
        solver.getCells()[51][6] = 1;
        solver.getCells()[47][6] = 1;
        solver.getCells()[52][6] = 1;
        solver.getCells()[58][6] = 1;

        System.out.println(solver.getGameBoard());

        List<Set<Integer>> clusters = solver.findClusters(solver.getCells());
        assertEquals(1, clusters.size());
        assertEquals(19, clusters.get(0).size());
    }

    @Test
    public void testTwoClusters() {
        solver.getCells()[45][6] = 1;
        solver.getCells()[40][6] = 1;
        solver.getCells()[50][6] = 1;
        solver.getCells()[46][6] = 1;

        solver.getCells()[84][6] = 2;
        solver.getCells()[79][6] = 2;
        solver.getCells()[74][6] = 2;

        System.out.println(solver.getGameBoard());
        List<Set<Integer>> clusters = solver.findClusters(solver.getCells());
        assertEquals(2, clusters.size());
    }

    @Test
    public void testHasClustersEmptyCells() {
        assertFalse(solver.hasClusters(solver.getCells()));
    }

    @Test
    public void testHasClustersOneCluster() {
        solver.getCells()[22][6] = 1;
        solver.getCells()[18][6] = 1;
        solver.getCells()[13][6] = 1;
        solver.getCells()[9][6] = 1;
        solver.getCells()[4][6] = 1;

        System.out.println(solver.getGameBoard());

        assertTrue(solver.hasClusters(solver.getCells()));
    }
}
