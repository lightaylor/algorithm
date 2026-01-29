package programmers.practice_exercise.running_race;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        String[] expected = {"mumu", "kai", "mine", "soe", "poe"};

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(players, callings),
            new Solution()::solution
        );
    }
}
