package programmers.practice_exercise.territory_game;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        int[][] land = {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}};
        int expected = 16;

        TestSupport.assertSolution(expected, land, new Solution()::solution);
    }
}
