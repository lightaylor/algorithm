package programmers.practice_exercise.roll_cake_cutting;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        int[] topping = {1, 2, 1, 3, 1, 4, 1, 2};
        int expected = 2;

        TestSupport.assertSolution(
            expected,
            topping,
            new Solution()::solution
        );
    }

    @Test
    public void test_2() {
        int[] topping = {1, 2, 3, 1, 4};
        int expected = 0;

        TestSupport.assertSolution(
            expected,
            topping,
            new Solution()::solution
        );
    }
}
