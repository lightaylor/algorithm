package practice_exercise.roughly_made_keyboard;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD", "AABB"};
        int[] expected = {9, 4};

        TestUtil.assertSolution(
            expected,
            new TestUtil.Input<>(keymap, targets),
            new Solution()::solution
        );
    }

    @Test
    public void test_2() throws IOException {
        String[] keymap = {"AA"};
        String[] targets = {"B"};
        int[] expected = {-1};

        TestUtil.assertSolution(
            expected,
            new TestUtil.Input<>(keymap, targets),
            new Solution()::solution
        );
    }

    @Test
    public void test_3() throws IOException {
        String[] keymap = {"AGZ", "BSSS"};
        String[] targets = {"ASA", "BGZ"};
        int[] expected = {4, 6};

        TestUtil.assertSolution(
            expected,
            new TestUtil.Input<>(keymap, targets),
            new Solution()::solution
        );
    }
}
