package test_2941;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for (String s : croatia) {
            input = input.replaceAll(s, "0");
        }

        bw.write(String.valueOf(input.length()));
        bw.close();
    }
}
