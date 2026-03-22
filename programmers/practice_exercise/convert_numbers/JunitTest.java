package programmers.practice_exercise.convert_numbers;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        int x = 10;
        int y = 40;
        int n = 5;
        int expected = 2;

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input3<>(x, y, n),
            new Solution()::solution
        );
    }

    @Test
    public void test_2() {
        int x = 10;
        int y = 40;
        int n = 30;
        int expected = 1;

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input3<>(x, y, n),
            new Solution()::solution
        );
    }

    @Test
    public void test_3() {
        int x = 2;
        int y = 5;
        int n = 4;
        int expected = -1;

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input3<>(x, y, n),
            new Solution()::solution
        );
    }
}
