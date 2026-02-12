package programmers._2021_kakao_blind_recruitement.minimize_revenue_decline;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        int[] sales = {14, 17, 15, 18, 19, 14, 13, 16, 28, 17};
        int[][] links = {{10, 8}, {1, 9}, {9, 7}, {5, 4}, {1, 5}, {5, 10}, {10, 6}, {1, 3}, {10, 2}};
        int expected = 44;

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(sales, links),
            new Solution()::solution
        );
    }

    @Test
    public void test_2() {
        int[] sales = {5, 6, 5, 3, 4};
        int[][] links = {{2, 3}, {1, 4}, {2, 5}, {1, 2}};
        int expected = 6;

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(sales, links),
            new Solution()::solution
        );
    }

    @Test
    public void test_3() {
        int[] sales = {5, 6, 5, 1, 4};
        int[][] links = {{2, 3}, {1, 4}, {2, 5}, {1, 2}};
        int expected = 5;

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(sales, links),
            new Solution()::solution
        );
    }

    @Test
    public void test_4() {
        int[] sales = {10, 10, 1, 1};
        int[][] links = {{3, 2}, {4, 3}, {1, 4}};
        int expected = 2;

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(sales, links),
            new Solution()::solution
        );
    }
}
