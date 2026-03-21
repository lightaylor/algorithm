package programmers.summer_winter_coding_2018.skill_tree;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        int expected = 2;

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(skill, skill_trees),
            new Solution()::solution
        );
    }
}
