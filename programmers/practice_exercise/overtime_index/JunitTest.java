package programmers.practice_exercise.overtime_index;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        int n = 4;
        int[] works = {4, 3, 3};
        long expected = 12;

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(n, works),
            new Solution()::solution
        );
    }

    @Test
    public void test_2() {
        int n = 1;
        int[] works = {2, 1, 2};
        long expected = 6;

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(n, works),
            new Solution()::solution
        );
    }

    @Test
    public void test_3() {
        int n = 3;
        int[] works = {1, 1};
        long expected = 0;

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(n, works),
            new Solution()::solution
        );
    }
}
