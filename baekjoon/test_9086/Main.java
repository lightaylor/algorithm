package test_9086;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            char[] s = br.readLine().toCharArray();
            bw.write(Character.toString(s[0]) + Character.toString(s[s.length - 1]) + "\n");
        }

        bw.close();
    }
}
