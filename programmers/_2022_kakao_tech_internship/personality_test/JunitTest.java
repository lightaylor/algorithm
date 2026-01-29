package programmers._2022_kakao_tech_internship.personality_test;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        String expected = "TCMA";

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(survey, choices),
            (a, b) -> new Solution().solution(a, b)
        );
    }

    @Test
    public void test_2() throws IOException {
        String[] survey = {"TR", "RT", "TR"};
        int[] choices = {7, 1, 3};
        String expected = "RCJA";

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input<>(survey, choices),
            (a, b) -> new Solution().solution(a, b)
        );
    }
}
