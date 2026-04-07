package programmers.practice_exercise.best_set;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        int n = 2;
        int s = 9;
        int[] expected = {4, 5};

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(n, s),
            new Solution()::solution
        );
    }

    @Test
    public void test_2() {
        int n = 2;
        int s = 1;
        int[] expected = {-1};

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(n, s),
            new Solution()::solution
        );
    }

    @Test
    public void test_3() {
        int n = 2;
        int s = 8;
        int[] expected = {4, 4};

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(n, s),
            new Solution()::solution
        );
    }
}
