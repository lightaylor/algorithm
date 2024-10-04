package silver4.test_1018;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        char[][] arr = new char[n][m];
        int count = 32;

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {
                char[][] arrB = new char[8][8];
                char[][] arrW = new char[8][8];

                for (int a = 0; a < 8; a++) {
                    for (int b = 0; b < 8; b++) {
                        arrW[a][b] = arr[a + i][b + j];
                        arrB[a][b] = arr[a + i][b + j];
                    }
                }

                int tempW = arrB[0][0] != 'W' ? 1 : 0;
                int tempB = arrW[0][0] != 'B' ? 1 : 0;
                arrW[0][0] = 'W';
                arrB[0][0] = 'B';

                for (int h = 0; h < 8; h++) {
                    for(int k = 0; k < 8; k++) {
                        if (h > 0) {
                            if (arrB[h][k] == arrB[h - 1][k]) {
                                tempB++;
                                arrB[h][k] = arrB[h - 1][k] == 'B' ? 'W' : 'B';
                            }

                            if (arrW[h][k] == arrW[h - 1][k]) {
                                tempW++;
                                arrW[h][k] = arrW[h - 1][k] == 'B' ? 'W' : 'B';
                            }
                        } else if (k < 7) {
                            if (arrB[h][k] == arrB[h][k + 1]) {
                                tempB++;
                                arrB[h][k + 1] = arrB[h][k] == 'B' ? 'W' : 'B';
                            }

                            if (arrW[h][k] == arrW[h][k + 1]) {
                                tempW++;
                                arrW[h][k + 1] = arrW[h][k] == 'B' ? 'W' : 'B';
                            }
                        }
                    }
                }
                count = Math.min(count, Math.min(tempW, tempB));
            }
        }
        bw.write(String.valueOf(count));
        bw.close();
    }
}
