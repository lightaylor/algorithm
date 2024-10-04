package silver.level1.test_2529;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    private static boolean[] check;
    private static String[] input;
    private static List<String> answer;
    private static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        answer = new ArrayList<>();
        check = new boolean[10];

        n = Integer.parseInt(br.readLine());
        input = br.readLine().split(" ");
        go(0, "");


        Collections.sort(answer);
        bw.write(answer.get(answer.size() - 1));
        bw.newLine();
        bw.write(answer.get(0));
        bw.newLine();
        bw.close();
    }

    private static void go (int index, String num) {
        if (index == n + 1) {
             answer.add(num);
             return;
         }

         for (int i = 0; i <= 9; i++) {
             if (check[i]) continue;
             if (index == 0 || checkValue(num.charAt(index - 1) - '0', i, input[index - 1])) {
                 check[i] = true;
                 go(index + 1, num + i);
                 check[i] = false;
             }
         }
    }

    private static boolean checkValue(int x, int y, String s) {
        if (s.equals(">")) {
            return x > y;
        } else {
            return x < y;
        }
    }
}
