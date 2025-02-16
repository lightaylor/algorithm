package bronze.level2.test_2231.java;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i = 1; i <= n; i++){
            char[] c = String.valueOf(i).toCharArray();
            int sum = 0;
            for (char value : c) {
                sum += Integer.parseInt(String.valueOf(value));
            }

            if (n == sum + i) {
                result = n - sum;
                break;
            }
        }

        bw.write(String.valueOf(result));
        bw.close();
    }
}
