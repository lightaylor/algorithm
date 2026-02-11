package programmers._2019_kakao_blind_recruitment.pathfinding_game;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        int[][] nodeinfo = {{5, 3}, {11, 5}, {13, 3}, {3, 5}, {6, 1}, {1, 3}, {8, 6}, {7, 2}, {2, 2}};
        int[][] expected = {{7, 4, 6, 9, 1, 8, 5, 2, 3}, {9, 6, 5, 8, 1, 4, 3, 2, 7}};

        TestSupport.assertSolution(
            expected,
            nodeinfo,
            new Solution()::solution
        );
    }
}
