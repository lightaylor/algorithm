package silver.level2.test_6603_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Main {
    private static int[] NUMBERS;
    private static boolean[] CHECK;
    private static Set<String> answers;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        while(!input.equals("0")) {
            NUMBERS = Stream.of(input.split(" ")).mapToInt(Integer::parseInt).toArray();
            CHECK = new boolean[NUMBERS[0] + 1];
            answers = new LinkedHashSet<>();
            recursion(0, 1, new StringBuilder());

            for (String answer : answers) {
                System.out.println(answer);
            }
            System.out.println();
            input = br.readLine();
        }
    }

    private static void recursion(int idx, int start, StringBuilder sb) {
        if (idx == 6) {
            answers.add(sb.toString());
            return;
        }

        for(int i = start; i < NUMBERS.length; i++) {
            if (!CHECK[i]) {
                CHECK[i] = true;
                int temp = sb.length();
                recursion(idx + 1, i + 1, sb.append(NUMBERS[i]).append(" "));
                sb.delete(temp, sb.length());
                CHECK[i] = false;
            }
        }
    }
}
