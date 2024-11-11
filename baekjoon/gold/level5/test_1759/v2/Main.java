package gold.level5.test_1759.v2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private final static String[] VOWELS = {"a", "e", "i", "o", "u"};
    private static String[] SPELL_ARR;
    private static int L;
    private static int C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        SPELL_ARR = br.readLine().split(" ");
        Arrays.sort(SPELL_ARR);

        recursion(0, 0, 0, 0, "");
    }

    private static void recursion(int idx, int start, int consonantCount, int vowelCount, String answer) {
        if (idx == L) {
            if (vowelCount > 0 && consonantCount > 1) {
                System.out.println(answer);
            }
            return;
        }

        for (int i = start; i < C; i++) {
            if (Arrays.asList(VOWELS).contains(SPELL_ARR[i])) {
                recursion(idx + 1, i + 1, consonantCount, vowelCount + 1, answer + SPELL_ARR[i]);
            } else {
                recursion(idx + 1, i + 1, consonantCount + 1, vowelCount, answer + SPELL_ARR[i]);
            }
        }
    }
}
