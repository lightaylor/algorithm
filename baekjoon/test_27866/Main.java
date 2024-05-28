package test_27866;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] text = br.readLine().toCharArray();
        int n = Integer.parseInt(br.readLine());

        bw.write(text[n-1]);
        bw.close();
    }
}
