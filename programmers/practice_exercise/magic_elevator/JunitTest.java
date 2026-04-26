package programmers.practice_exercise.magic_elevator;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        int storey = 16;
        int expected = 6;

        TestSupport.assertSolution(
            expected,
            storey,
            new Solution()::solution
        );
    }

    @Test
    public void test_2() {
        int storey = 2554;
        int expected = 16;

        TestSupport.assertSolution(
            expected,
            storey,
            new Solution()::solution
        );
    }
}
