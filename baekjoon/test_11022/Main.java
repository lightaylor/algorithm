package test_11022;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            bw.write(String.format("Case #%d: %s + %s = %d\n", i+1, s[0], s[1], Integer.parseInt(s[0]) + Integer.parseInt(s[1])));
        }

        bw.close();
    }
}
