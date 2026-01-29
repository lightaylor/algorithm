package baekjoon.bronze.level4.test_31403;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());


        bw.write(String.valueOf(a + b - c));
        bw.newLine();
        bw.write(String.valueOf(Integer.parseInt(a + "" + b) - c));
        bw.newLine();
        bw.close();
    }
}
