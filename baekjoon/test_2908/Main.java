package test_2908;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        String a = "";
        String b = "";

        for (int i = 0; i < 3; i++) {
            a += input[0].charAt(2 - i);
            b += input[1].charAt(2 - i);
        }

        bw.write(Integer.parseInt(a) > Integer.parseInt(b) ? String.valueOf(a) : String.valueOf(b));
        bw.close();
    }
}
