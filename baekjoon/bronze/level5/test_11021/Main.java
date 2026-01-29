package baekjoon.bronze.level5.test_11021;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.valueOf(br.readLine());

        for (int i = 0; i < count; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            bw.write("Case #" + (i + 1) + ": " + (a + b) + "\n");
        }
        bw.close();
    }
}
