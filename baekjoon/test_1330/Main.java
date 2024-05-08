package baekjoon.test_1330;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int a = Integer.valueOf(input[0]);
        int b = Integer.valueOf(input[1]);
        String output = a == b ? "==" : (a < b ? "<" : ">");

        bw.write(output);
        bw.close();
    }
}
