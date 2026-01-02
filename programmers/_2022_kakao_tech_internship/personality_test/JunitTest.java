package _2022_kakao_tech_internship.personality_test;

import org.junit.Test;
import util.TestUtil;

import java.io.IOException;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        String expected = "TCMA";

        TestUtil.assertSolution(
            expected,
            new TestUtil.Input<>(survey, choices),
            (a, b) -> new Solution().solution(a, b)
        );
    }
}
