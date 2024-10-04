package bronze.level2.test_1009;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int[][] computer = new int[][]{
                {1, 1, 1, 1},
                {2, 4, 8, 6},
                {3, 9, 7, 1},
                {4, 6, 4, 6},
                {5, 5, 5, 5},
                {6, 6, 6, 6},
                {7, 9, 3, 1},
                {8, 4, 2, 6},
                {9, 1, 9, 1}
        };

        for(int i = 0; i < count; i++) {
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            int result = 10;

            if (b == 0) result = 1;
            else if (a % 10 > 0) result = computer[a % 10 - 1][(b - 1) % 4];

            bw.write(result + "\n");
        }
        bw.close();
    }
}
