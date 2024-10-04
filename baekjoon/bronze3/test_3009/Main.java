package bronze3.test_3009;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[3][2];

        for (int i = 0; i < 3; i++) {
            arr[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int x = arr[0][0] == arr[1][0] ? arr[2][0] : (arr[0][0] == arr[2][0] ? arr[1][0] : arr[0][0]);
        int y = arr[0][1] == arr[1][1] ? arr[2][1] : (arr[0][1] == arr[2][1] ? arr[1][1] : arr[0][1]);

        bw.write(x + " " + y);
        bw.close();
    }
}
