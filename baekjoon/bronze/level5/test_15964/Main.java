package baekjoon.bronze.level5.test_15964;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        long a = Integer.parseInt(input[0]);
        long b = Integer.parseInt(input[1]);
        long answer = (a + b) * (a - b);

        bw.write(String.valueOf(answer));
        bw.close();
    }
}
