package programmers.greedy.joystick;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        String name = "JEROEN";
        int expected = 56;

        TestSupport.assertSolution(
            expected,
            name,
            new Solution()::solution
        );
    }

    @Test
    public void test_2() {
        String name = "JAN";
        int expected = 23;

        TestSupport.assertSolution(
            expected,
            name,
            new Solution()::solution
        );
    }
}
