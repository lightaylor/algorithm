package baekjoon.gold.level5.test_1759.v1;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    private static BufferedWriter bw;
    private static String[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] n = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        arr = br.readLine().split(" ");
        Arrays.sort(arr);
        go(n[0], "", 0);
        bw.close();
    }

    private static void go(int n, String password, int i) throws IOException {
        if (password.length() == n) {
            if (check(password)) {
                bw.write(password);
                bw.newLine();
            }
            return;
        }
        if (i >= arr.length) return;
        go(n, password + arr[i], i + 1);
        go(n, password, i + 1);
    }

    private static boolean check(String password) {
        String[] spellArr = {"a", "e", "i", "o", "u"};
        int count = 0;

        for (String spell : spellArr) {
            if (password.contains(spell)) count += 1;
        }

        return password.length() - count > 1 && count > 0;
    }
}

//public class Main {
//    private static StringBuffer sb;
//    private static String[] answer;
//    private static String[] word;
//    private static final String[] aeiou = {"a", "e", "i", "o", "u"};
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        sb = new StringBuffer();
//        int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//        word = br.readLine().split(" ");
//        answer = new String[input[0]];
//        Arrays.sort(word);
//        dfs(0, 0, input[0], input[1]);
//        System.out.print(sb);
//    }
//
//    static void dfs (int idx, int selected, int l, int c) {
//        if (idx == l) {
//            if (check()) {
//                StringBuilder temp = new StringBuilder();
//                for(String s : answer) {
//                    temp.append(s);
//                }
//                sb.append(temp).append("\n");
//            }
//            return;
//        }
//
//        for (int i = selected; i < c; i++) {
//            answer[idx] = word[i];
//            dfs(idx + 1, i + 1, l, c);
//        }
//    }
//
//    static boolean check () {
//        int count = 0;
//
//        for (String a : answer) {
//            for (String s : aeiou) {
//                count += a.equals(s) ? 1 : 0;
//            }
//        }
//
//        return count > 0 && answer.length - count > 1;
//    }
//}
