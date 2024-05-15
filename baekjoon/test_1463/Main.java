package test_1463;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.valueOf(br.readLine());
        int[] arr = new int[input + 1];
        arr[0] = arr[1] = 0;
        arr[2] = 1;

        for (int i = 3; i <= input; i++) {
            if (i % 6 == 0) arr[i] = Math.min(arr[i/3] + arr[i/2], arr[i - 1];
            else if (i % 3 == 0) arr[i] = Math.min(arr[i/3] + 1, arr[i - 1] + 1);
            else if (i % 2 == 0) arr[i] = Math.min(arr[i/2] + 1, arr[i - 1] + 1);
            else arr[i] = arr[i - 1] + 1;
        }

        bw.write(String.valueOf(arr[input]));
        bw.close();
    }
}
