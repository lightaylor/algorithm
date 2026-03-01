package programmers._2018_kakao_blind_recruitement.n_base_game;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        int n = 2;
        int t = 4;
        int m = 2;
        int p = 1;
        String expected = "0111";

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input4<>(n, t, m, p),
            new Solution()::solution
        );
    }

    @Test
    public void test_2() {
        int n = 16;
        int t = 16;
        int m = 2;
        int p = 1;
        String expected = "02468ACE11111111";

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input4<>(n, t, m, p),
            new Solution()::solution
        );
    }

    @Test
    public void test_3() {
        int n = 16;
        int t = 16;
        int m = 2;
        int p = 2;
        String expected = "13579BDF01234567";

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input4<>(n, t, m, p),
            new Solution()::solution
        );
    }
}
