package baekjoon.silver.level4.test_1620;

import org.junit.Test;
import util.TestSupport;

import java.io.IOException;

import static util.ThrowingRunnable.runUnchecked;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void test_1() throws IOException {
        String input = """
                26 5
                Bulbasaur
                Ivysaur
                Venusaur
                Charmander
                Charmeleon
                Charizard
                Squirtle
                Wartortle
                Blastoise
                Caterpie
                Metapod
                Butterfree
                Weedle
                Kakuna
                Beedrill
                Pidgey
                Pidgeotto
                Pidgeot
                Rattata
                Raticate
                Spearow
                Fearow
                Ekans
                Arbok
                Pikachu
                Raichu
                25
                Raichu
                3
                Pidgey
                Kakuna
                """;
        String expectedOutput = """
                Pikachu
                26
                Venusaur
                16
                14
                """;
        String actualOutput = TestSupport.runAndCapture(input, () -> runUnchecked(() -> Main.main(new String[0])));
        assertEquals(expectedOutput, actualOutput);
    }


}
