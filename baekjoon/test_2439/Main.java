package test_2439;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());

        for(int i = 0; i < input; i++) {
            for(int j = input - 1; j > i; j--) {
                bw.write(" ");
            }
            for(int k = 0; k <= i; k++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.close();
    }
}
