package baekjoon.test_1008;

import java.io.*;

public class Main {
    static public void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        double d = Double.parseDouble(input[0]) / Double.parseDouble(input[1]);
        bw.write(Double.toString(d));
        bw.close();
    }
}
