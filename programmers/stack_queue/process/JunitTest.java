package programmers.stack_queue.process;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        int expected = 1;

        TestSupport.assertSolution(expected, new TestSupport.Input<>(priorities, location), new Solution()::solution);
    }

    @Test
    public void test_2() {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        int expected = 5;

        TestSupport.assertSolution(expected, new TestSupport.Input<>(priorities, location), new Solution()::solution);
    }
}
