package programmers.summer_winter_coding_2018.number_game;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        int[] A = {5, 1, 3, 7};
        int[] B = {2, 2, 6, 8};
        int expected = 3;

        TestSupport.assertSolution(expected, new TestSupport.Input<>(A, B), new Solution()::solution);
    }

    @Test
    public void test_2() {
        int[] A = {2, 2, 2, 2};
        int[] B = {1, 1, 1, 1};
        int expected = 0;

        TestSupport.assertSolution(expected, new TestSupport.Input<>(A, B), new Solution()::solution);
    }
}
