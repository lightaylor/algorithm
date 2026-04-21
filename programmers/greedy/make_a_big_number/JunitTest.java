package programmers.greedy.make_a_big_number;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        String number = "1924";
        int k = 2;
        String expected = "94";

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(number, k),
            new Solution()::solution
        );
    }

    @Test
    public void test_2() {
        String number = "1231234";
        int k = 3;
        String expected = "3234";

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(number, k),
            new Solution()::solution
        );
    }

    @Test
    public void test_3() {
        String number = "4177252841";
        int k = 4;
        String expected = "775841";

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(number, k),
            new Solution()::solution
        );
    }
}
