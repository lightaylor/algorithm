package silver5.test_7596;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 1;
        String[] arr;

        while (n > 0) {
            arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = br.readLine();
            }

            Arrays.sort(arr);
            bw.write(String.valueOf(count++));
            bw.newLine();
            for (String i : arr) {
                bw.write(i);
                bw.newLine();
            }

            n = Integer.parseInt(br.readLine());
        }
        bw.close();
    }
}
