package programmers.dfs_bfs.network;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        int expected = 2;

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(n, computers),
            new Solution()::solution
        );
    }

    @Test
    public void test_2() {
        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
        int expected = 1;

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(n, computers),
            new Solution()::solution
        );
    }
}
