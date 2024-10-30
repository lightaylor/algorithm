package silver.level1.test_2529_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    private static int N;
    private static char[] SIGNS;
    private static boolean[] CHECK;
    private static List<String> ANSWER;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        SIGNS = br.readLine().replaceAll(" ", "").toCharArray();
        CHECK = new boolean[10];
        ANSWER = new LinkedList<>();

        recursion(0, "");
        System.out.println(ANSWER.get(ANSWER.size() - 1));
        System.out.println(ANSWER.get(0));
    }

    private static void recursion(int idx, String answer) {
        if (idx == N + 1) {
            checkSign(answer);
            return;
        }

        for (int i = 0; i <= 9; i++) {
            if (CHECK[i]) continue;
            CHECK[i] = true;
            recursion(idx + 1, answer + i);
            CHECK[i] = false;
        }
    }

    private static void checkSign(String answer) {
        char[] number = answer.toCharArray();
        int i = 0;
        int a = Character.getNumericValue(number[i++]);
        StringBuilder sb = new StringBuilder().append(number[0]);

        for (char sign : SIGNS) {
            int b = Character.getNumericValue(number[i++]);
            if ((sign == '>' && a <= b) || (sign == '<' && a >= b)) {
                return;
            }
            sb.append(b);
            a = b;
        }
        ANSWER.add(sb.toString());
    }
}
