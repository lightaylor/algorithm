package programmers._2021_kakao_blind_recruitement.shared_taxi_fare;


import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        int n = 6;
        int s = 4;
        int a = 6;
        int b = 2;
        int[][] fares = {{4, 1, 10}, {3, 5, 24}, {5, 6, 2}, {3, 1, 41}, {5, 1, 24}, {4, 6, 50}, {2, 4, 66}, {2, 3, 22}, {1, 6, 25}};
        int expected = 82;

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input5<>(n, s, a, b, fares),
            new Solution()::solution
        );
    }

    @Test
    public void test_2() {
        int n = 7;
        int s = 3;
        int a = 4;
        int b = 1;
        int[][] fares = {{5, 7, 9}, {4, 6, 4}, {3, 6, 1}, {3, 2, 3}, {2, 1, 6}};
        int expected = 14;

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input5<>(n, s, a, b, fares),
            new Solution()::solution
        );
    }

    @Test
    public void test_3() {
        int n = 6;
        int s = 4;
        int a = 5;
        int b = 6;
        int[][] fares = {{2, 6, 6}, {6, 3, 7}, {4, 6, 7}, {6, 5, 11}, {2, 5, 12}, {5, 3, 20}, {2, 4, 8}, {4, 3, 9}};
        int expected = 18;

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input5<>(n, s, a, b, fares),
            new Solution()::solution
        );
    }
}
