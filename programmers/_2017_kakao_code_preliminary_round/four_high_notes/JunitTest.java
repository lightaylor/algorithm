package programmers._2017_kakao_code_preliminary_round.four_high_notes;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        Integer input = 15;
        int expected = 1;

        TestSupport.assertSolution(
            expected,
            input,
            new Solution()::solution
        );
    }

    @Test
    public void test_2() {
        Integer input = 24;
        int expected = 0;

        TestSupport.assertSolution(
            expected,
            input,
            new Solution()::solution
        );
    }

    @Test
    public void test_3() {
        Integer input = 41;
        int expected = 2;

        TestSupport.assertSolution(
            expected,
            input,
            new Solution()::solution
        );
    }

    @Test
    public void test_4() {
        Integer input = 2147483647;
        int expected = 1735;

        TestSupport.assertSolution(
            expected,
            input,
            new Solution()::solution
        );
    }
}
