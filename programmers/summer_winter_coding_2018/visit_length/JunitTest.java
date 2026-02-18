package programmers.summer_winter_coding_2018.visit_length;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        String dirs = "ULURRDLLU";
        int expected = 7;

        TestSupport.assertSolution(
            expected,
            dirs,
            new Solution()::solution
        );
    }

    @Test
    public void test_2() {
        String dirs = "LULLLLLLU";
        int expected = 7;

        TestSupport.assertSolution(
            expected,
            dirs,
            new Solution()::solution
        );
    }
}
