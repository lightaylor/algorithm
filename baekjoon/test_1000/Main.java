package test_1000;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");
        int output = Integer.parseInt(str[0]) + Integer.parseInt(str[1]);

        bw.write(String.valueOf(output));
        bw.flush();
    }
}
