package programmers.summer_winter_coding_2018.base_station_installation;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        int n = 11;
        int[] stations = {4, 11};
        int w = 1;
        int expected = 3;

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input3<>(n, stations, w),
            new Solution()::solution
        );
    }

    @Test
    public void test_2() {
        int n = 16;
        int[] stations = {9};
        int w = 2;
        int expected = 3;

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input3<>(n, stations, w),
            new Solution()::solution
        );
    }
}
