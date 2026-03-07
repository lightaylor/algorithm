package programmers.heap.dual_priority_queue;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        String[] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        int[] expected = {0, 0};

        TestSupport.assertSolution(
            expected,
            operations,
            new Solution()::solution
        );
    }

    @Test
    public void test_2() {
        String[] operations = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        int[] expected = {333, -45};

        TestSupport.assertSolution(
            expected,
            operations,
            new Solution()::solution
        );
    }
}
