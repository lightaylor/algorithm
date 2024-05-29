package test_2566;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[9][9];
        int result = 0;
        int n = 1, m = 1;

        for (int i = 0; i < 9; i++) {
            arr[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for(int j = 0; j < 9; j++) {
                if (result < arr[i][j]) {
                   result = arr[i][j];
                   n = i + 1;
                   m = j + 1;
               }
           }
        }

        bw.write(result + "\n" + n + " " + m);
        bw.close();
    }
}
