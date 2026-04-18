package programmers._2022_kakao_tech_internship.equalize_the_sums_of_two_queues;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        int[] queue1 = {3, 2, 7, 2};
        int[] queue2 = {4, 6, 5, 1};
        int expected = 2;

        TestSupport.assertSolution(expected, new TestSupport.Input<>(queue1, queue2), new Solution()::solution);
    }

    @Test
    public void test_2() {
        int[] queue1 = {1, 2, 1, 2};
        int[] queue2 = {1, 10, 1, 2};
        int expected = 7;

        TestSupport.assertSolution(expected, new TestSupport.Input<>(queue1, queue2), new Solution()::solution);
    }

    @Test
    public void test_3() {
        int[] queue1 = {1, 1};
        int[] queue2 = {1, 5};
        int expected = -1;

        TestSupport.assertSolution(expected, new TestSupport.Input<>(queue1, queue2), new Solution()::solution);
    }
}
