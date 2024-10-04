package silver.level4.test_17219;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

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

        assertEquals(expectedOutput, test(input));
    }

    public String test(String input) throws IOException {
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stdout));

        Main.main(new String[0]);

        System.setIn(System.in);
        System.setOut(new PrintStream(System.out));

        return stdout.toString();
    }
}
