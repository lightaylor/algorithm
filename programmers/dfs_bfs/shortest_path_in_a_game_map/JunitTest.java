package programmers.dfs_bfs.shortest_path_in_a_game_map;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        int expected = 11;

        TestSupport.assertSolution(expected, maps, new Solution()::solution);
    }

    @Test
    public void test_2() {
        int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 0}, {0, 0, 0, 0, 1}};
        int expected = -1;

        TestSupport.assertSolution(expected, maps, new Solution()::solution);
    }
}
