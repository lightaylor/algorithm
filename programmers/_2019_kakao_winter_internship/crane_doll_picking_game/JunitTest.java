package _2019_kakao_winter_internship.crane_doll_picking_game;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        int expected = 4;

        TestUtil.assertSolution(
            expected,
            new TestUtil.Input<>(board, moves),
            new Solution()::solution
        );
    }
}
