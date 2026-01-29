package programmers._2023_kakao_blind_recruitement.personal_information_retention_period;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

public class JunitTest {

    @Test
    public void test_1() throws IOException {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        int[] expected = {1, 3};

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input3<>(today, terms, privacies),
            (a, b, c) -> new Solution().solution(a, b, c)
        );
    }

    @Test
    public void test_2() throws IOException {
        String today = "2020.01.01";
        String[] terms = {"Z 3", "D 5"};
        String[] privacies = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
        int[] expected = {1, 4, 5};

        TestSupport.assertSolution(
            expected,
            new TestSupport.Input3<>(today, terms, privacies),
            (a, b, c) -> new Solution().solution(a, b, c)
        );
    }
}
