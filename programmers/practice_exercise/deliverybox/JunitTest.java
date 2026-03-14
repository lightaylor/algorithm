package programmers.practice_exercise.deliverybox;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        int[] order = {4, 3, 1, 2, 5};
        int expected = 2;

        TestSupport.assertSolution(
            expected,
            order,
            new Solution()::solution
        );
    }

    @Test
    public void test_2() {
        int[] order = {5, 4, 3, 2, 1};
        int expected = 5;

        TestSupport.assertSolution(
            expected,
            order,
            new Solution()::solution
        );
    }
}
