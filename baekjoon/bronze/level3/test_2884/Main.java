package bronze.level3.test_2884;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int h = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        h = m < 45 && h == 0 ? 23 : (m < 45 ? h - 1 : h);
        m = m >= 45 ? m - 45 : m - 45 + 60;

        bw.write(h + " " + m);
        bw.close();
    }
}
