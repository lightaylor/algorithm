package gold5.test_1759;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    private static StringBuffer sb;
    private static String[] answer;
    private static String[] word;
    private static String[] aeiou = {"a", "e", "i", "o", "u"};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuffer();
        int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        word = br.readLine().split(" ");
        answer = new String[input[0]];
        Arrays.sort(word);
        dfs(0, 0, input[0], input[1]);
        System.out.print(sb);
    }

    static void dfs (int idx, int selected, int l, int c) {
        if (idx == l) {
            if (checkSpell()) {
                StringBuilder temp = new StringBuilder();
                for(String s : answer) {
                    temp.append(s);
                }
                sb.append(temp).append("\n");
            }
            return;
        }

        for (int i = selected; i < c; i++) {
            answer[idx] = word[i];
            dfs(idx + 1, i + 1, l, c);
        }
    }

    static boolean checkSpell () {
        int count = 0;

        for (String a : answer) {
            for (String s : aeiou) {
                count += a.equals(s) ? 1 : 0;
            }
        }

        return count > 0 && answer.length - count > 1;
    }
}
