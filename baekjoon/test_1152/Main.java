package test_1152;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] n = br.readLine().split(" ");
        bw.write(String.valueOf(n.length));
        bw.close();
    }
}
