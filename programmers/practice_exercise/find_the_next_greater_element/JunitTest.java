package programmers.practice_exercise.find_the_next_greater_element;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        int[] numbers = {2, 3, 3, 5};
        int[] expected = {3, 5, 5, -1};

        TestSupport.assertSolution(
            expected,
            numbers,
            new Solution()::solution
        );
    }

    @Test
    public void test_2() {
        int[] numbers = {9, 1, 5, 3, 6, 2};
        int[] expected = {-1, 5, 6, 6, -1, -1};

        TestSupport.assertSolution(
            expected,
            numbers,
            new Solution()::solution
        );
    }
}
