package bronze3.test_10988;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int n = input.length() / 2;
        String result = "1";

        for(int i = 0; i < n; i++) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) result = "0";
        }
        bw.write(result);
        bw.close();
    }
}
