package practice_exercise.making_a_hanburger;

import org.junit.Test;
import util.TestUtil;

public class JunitTest {

    @Test
    public void test_1() {
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int expected = 2;

        TestUtil.assertSolution(
            expected,
            ingredient,
            new Solution()::solution
        );
    }

    @Test
    public void test_2() {
        int[] ingredient = {1, 3, 2, 1, 2, 1, 3, 1, 2};
        int expected = 0;

        TestUtil.assertSolution(
            expected,
            ingredient,
            new Solution()::solution
        );
    }
}
