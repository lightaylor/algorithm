package baekjoon.bronze.level5.test_2753;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());

        if (input % 4 == 0 && input % 100 != 0) bw.write("1");
        else if (input % 400 == 0) bw.write("1");
        else bw.write("0");

        bw.close();
    }
}
