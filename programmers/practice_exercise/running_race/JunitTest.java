package practice_exercise.running_race;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        String[] expected = {"mumu", "kai", "mine", "soe", "poe"};

        TestUtil.assertSolution(
            expected,
            new TestUtil.Input<>(players, callings),
            new Solution()::solution
        );
    }
}
