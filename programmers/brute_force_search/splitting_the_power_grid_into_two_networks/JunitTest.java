package programmers.brute_force_search.splitting_the_power_grid_into_two_networks;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        int n = 9;
        int[][] wires = {{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}};
        int expected = 3;

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(n, wires),
            new Solution()::solution
        );
    }

    @Test
    public void test_2() {
        int n = 4;
        int[][] wires = {{1, 2}, {2, 3}, {3, 4}};
        int expected = 0;

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(n, wires),
            new Solution()::solution
        );
    }

    @Test
    public void test_3() {
        int n = 7;
        int[][] wires = {{1, 2}, {2, 7}, {3, 7}, {3, 4}, {4, 5}, {6, 7}};
        int expected = 1;

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(n, wires),
            new Solution()::solution
        );
    }
}
