package greedy.joystick;

import org.junit.Test;
import util.TestUtil;

public class JunitTest {

    @Test
    public void test_1() {
        String name = "JEROEN";
        int expected = 56;

        TestUtil.assertSolution(
            expected,
            name,
            new Solution()::solution
        );
    }

    @Test
    public void test_2() {
        String name = "JAN";
        int expected = 23;

        TestUtil.assertSolution(
            expected,
            name,
            new Solution()::solution
        );
    }
}
