package bronze.level2.test_10811;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[] arr = new int[n];

        for(int i = 0; i < n ; i++) arr[i] = i + 1;

        for(int i = 0; i < m; i++) {
            input = br.readLine().split(" ");
            int[] arr2 = arr.clone();
            int k = 1;
            for (int j = Integer.parseInt(input[0]) - 1; j < Integer.parseInt(input[1]); j++) {
                arr[j] = arr2[Integer.parseInt(input[1]) - k];
                k++;
            }
        }

        for(int j : arr) bw.write(j + " ");
        bw.close();
    }
}
