package silver.level4.test_10825;

import common.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static common.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
            12
            Junkyu 50 60 100
            Sangkeun 80 60 50
            Sunyoung 80 70 100
            Soong 50 60 90
            Haebin 50 60 100
            Kangsoo 60 80 100
            Donghyuk 80 60 100
            Sei 70 70 70
            Wonseob 70 70 90
            Sanghyun 70 70 80
            nsj 80 80 80
            Taewhan 50 60 90
            """;
        String expectedOutput = """
            Donghyuk
            Sangkeun
            Sunyoung
            nsj
            Wonseob
            Sanghyun
            Sei
            Kangsoo
            Haebin
            Junkyu
            Soong
            Taewhan
            """;

        String actualOutput = TestUtil.executeTest(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }

}
