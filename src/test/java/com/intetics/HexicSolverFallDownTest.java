package com.intetics;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Date: 10/31/12
 * Time: 4:11 AM
 *
 * @author: dmitry.krivaltsevich@gmail.com
 */
public class HexicSolverFallDownTest {

    private HexicSolver solver = new HexicSolver();

    @Test
    public void testFallDownEmptyCells() {
        solver.fallDown(solver.getCells());

        assertEquals("   _   _   _   _   _\n" +
                " _/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "  \\_/ \\_/ \\_/ \\_/ \\_/",
                solver.getGameBoard());
    }

    @Test
    public void testFallDownOneNonEmptyCell() {
        solver.getCells()[0][6] = 1;
        solver.fallDown(solver.getCells());

        assertEquals("   _   _   _   _   _\n" +
                " _/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/1\\_/ \\_/ \\_/ \\_/ \\\n" +
                "  \\_/ \\_/ \\_/ \\_/ \\_/",
                solver.getGameBoard());
    }

    @Test
    public void testFallDownFromCell5() {
        solver.getCells()[5][6] = 1;
        solver.fallDown(solver.getCells());

        assertEquals("   _   _   _   _   _\n" +
                " _/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/1\\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "  \\_/ \\_/ \\_/ \\_/ \\_/",
                solver.getGameBoard());
    }

    @Test
    public void testFallDownFromCell6() {
        solver.getCells()[6][6] = 1;
        solver.fallDown(solver.getCells());

        assertEquals("   _   _   _   _   _\n" +
                " _/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/1\\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "  \\_/ \\_/ \\_/ \\_/ \\_/",
                solver.getGameBoard());
    }

    @Test
    public void testFallDownFromCell1() {
        solver.getCells()[1][6] = 1;
        solver.fallDown(solver.getCells());

        assertEquals("   _   _   _   _   _\n" +
                " _/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/1\\_/ \\_/ \\_/ \\\n" +
                "  \\_/ \\_/ \\_/ \\_/ \\_/",
                solver.getGameBoard());
    }

    @Test
    public void testFallDownFromCell7() {
        solver.getCells()[7][6] = 1;
        solver.fallDown(solver.getCells());

        assertEquals("   _   _   _   _   _\n" +
                " _/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/1\\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "  \\_/ \\_/ \\_/ \\_/ \\_/",
                solver.getGameBoard());
    }

    @Test
    public void testFallDownFromCell2() {
        solver.getCells()[2][6] = 1;
        solver.fallDown(solver.getCells());

        assertEquals("   _   _   _   _   _\n" +
                " _/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/1\\_/ \\_/ \\\n" +
                "  \\_/ \\_/ \\_/ \\_/ \\_/",
                solver.getGameBoard());
    }

    @Test
    public void testFallDownFromCell8() {
        solver.getCells()[8][6] = 1;
        solver.fallDown(solver.getCells());

        assertEquals("   _   _   _   _   _\n" +
                " _/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/1\\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "  \\_/ \\_/ \\_/ \\_/ \\_/",
                solver.getGameBoard());
    }

    @Test
    public void testFallDownFromCell3() {
        solver.getCells()[3][6] = 1;
        solver.fallDown(solver.getCells());

        assertEquals("   _   _   _   _   _\n" +
                " _/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/1\\_/ \\\n" +
                "  \\_/ \\_/ \\_/ \\_/ \\_/",
                solver.getGameBoard());
    }

    @Test
    public void testFallDownFromCell9() {
        solver.getCells()[9][6] = 1;
        solver.fallDown(solver.getCells());

        assertEquals("   _   _   _   _   _\n" +
                " _/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/1\\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "  \\_/ \\_/ \\_/ \\_/ \\_/",
                solver.getGameBoard());
    }

    @Test
    public void testFallDownFromCell4() {
        solver.getCells()[4][6] = 1;
        solver.fallDown(solver.getCells());

        assertEquals("   _   _   _   _   _\n" +
                " _/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/1\\\n" +
                "  \\_/ \\_/ \\_/ \\_/ \\_/",
                solver.getGameBoard());
    }

    @Test
    public void testFallDownTwoCells() {
        solver.getCells()[0][6] = 1;
        solver.getCells()[5][6] = 2;

        solver.fallDown(solver.getCells());

        assertEquals("   _   _   _   _   _\n" +
                " _/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/2\\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/1\\_/ \\_/ \\_/ \\_/ \\\n" +
                "  \\_/ \\_/ \\_/ \\_/ \\_/",
                solver.getGameBoard());
    }

    @Test
    public void testFallDownManyCells() {
        solver.getCells()[0][6] = 1;
        solver.getCells()[5][6] = 2;
        solver.getCells()[10][6] = 3;
        solver.getCells()[15][6] = 4;

        solver.fallDown(solver.getCells());

        assertEquals("   _   _   _   _   _\n" +
                " _/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/ \\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/ \\_/ \\_/ \\_/ \\_/ \\\n" +
                "/2\\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/1\\_/ \\_/ \\_/ \\_/ \\\n" +
                "/4\\_/ \\_/ \\_/ \\_/ \\_/\n" +
                "\\_/3\\_/ \\_/ \\_/ \\_/ \\\n" +
                "  \\_/ \\_/ \\_/ \\_/ \\_/",
                solver.getGameBoard());
    }
}
