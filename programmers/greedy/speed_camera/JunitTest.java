package programmers.greedy.speed_camera;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        int[][] routes = {{-20, -15}, {-14, -5}, {-18, -13}, {-5, -3}};
        int expected = 2;

        TestSupport.assertSolution(
            expected,
            routes,
            new Solution()::solution
        );
    }
}
