package programmers.dfs_bfs.word_transformation;

import org.junit.Test;
import util.TestSupport;

public class JunitTest {

    @Test
    public void test_1() {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        int expected = 4;

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input3<>(begin, target, words),
            new Solution()::solution
        );
    }

    @Test
    public void test_2() {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log"};
        int expected = 0;

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input3<>(begin, target, words),
            new Solution()::solution
        );
    }
}
