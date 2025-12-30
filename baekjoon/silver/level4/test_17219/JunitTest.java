package silver.level4.test_17219;

import util.TestUtil;
import org.junit.Test;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                16 4
                noj.am IU
                acmicpc.net UAENA
                startlink.io THEKINGOD
                google.com ZEZE
                nate.com VOICEMAIL
                naver.com REDQUEEN
                daum.net MODERNTIMES
                utube.com BLACKOUT
                zum.com LASTFANTASY
                dreamwiz.com RAINDROP
                hanyang.ac.kr SOMEDAY
                dhlottery.co.kr BOO
                duksoo.hs.kr HAVANA
                hanyang-u.ms.kr OBLIVIATE
                yd.es.kr LOVEATTACK
                mcc.hanyang.ac.kr ADREAMER
                startlink.io
                acmicpc.net
                noj.am
                mcc.hanyang.ac.kr
                """;
        String expectedOutput = """
                THEKINGOD
                UAENA
                IU
                ADREAMER
                """;
        String actualOutput = TestUtil.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }


}
