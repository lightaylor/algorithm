package baekjoon.bronze.level5.test_10951;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        while (str != null && !str.isEmpty()) {
            String[] s = str.split(" ");
            bw.write(Integer.parseInt(s[0]) + Integer.parseInt(s[1]) + "\n");
            str = br.readLine();
        }

        bw.close();
    }
}
