package baekjoon.bronze.level2.test_25501;

import java.io.*;

public class Main {
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            count = 0;
            bw.write(isPalindrome(input, 0, input.length()-1) + " " + count);
            bw.newLine();
        }

        bw.close();
    }

    static int isPalindrome (String s, int l, int r) {
        count++;
        if (l >= r) return 1;
        else if (s.charAt(l) != s.charAt(r)) return 0;
        else return isPalindrome(s, l+1, r-1);
    }
}
