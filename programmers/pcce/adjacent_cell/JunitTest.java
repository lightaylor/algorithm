package programmers.pcce.adjacent_cell;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        String[][] board = {{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"}, {"blue", "orange", "red", "red"}, {"orange", "orange", "red", "blue"}};
        int h = 1;
        int w = 1;
        int expected = 2;

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input3<>(board, h, w),
            new Solution()::solution
        );
    }

    @Test
    public void test_2() {
        String[][] board = {{"yellow", "green", "blue"}, {"blue", "green", "yellow"}, {"yellow", "blue", "blue"}};
        int h = 0;
        int w = 1;
        int expected = 1;

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input3<>(board, h, w),
            new Solution()::solution
        );
    }
}
