package silver2.test_3085;

import java.io.*;

public class Main {
    private static int check(char[][] arr, int x1, int y1, int x2, int y2) {
        int n = arr.length;
        int result = 1;

        // 변경 행/열만 check
        for (int i = x1; i <= x2; i++) {
            int count = 1;
            for (int j = 0; j < n - 1; j++) {
                if (arr[i][j] == arr[i][j+1]) {
                    count++;
                }
                else {
                    count = 1;
                }
                result = Math.max(result, count);
            }
        }

        for (int i = y1; i <= y2; i++) {
            int count = 1;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j][i] == arr[j+1][i]) {
                    count++;
                } else {
                    count = 1;
                }
                result = Math.max(result, count);
            }
        }

//        모든 경우 확인
//        for (int i = 0; i < n; i++) {
//            int count = 1;
//            for (int j = 1; j < n; j++) {
//                if (arr[i][j] == arr[i][j-1]) {
//                    count++;
//                } else {
//                    count = 1;
//                }
//                result = Math.max(result, count);
//            }
//
//            count = 1;
//            for (int j = 1; j < n; j++) {
//                if (arr[j][i] == arr[j-1][i]) {
//                    count++;
//                } else {
//                    count = 1;
//                }
//                result = Math.max(result, count);
//            }
//        }

        return result;
    }

    private static void swap(char[][] arr, int x1, int y1, int x2, int y2) {
        char temp = arr[x1][y1];
        arr[x1][y1] = arr[x2][y2];
        arr[x2][y2] = temp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        char[][] arr = new char[n][n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        int count = 0;
        for (int x = 0; x < n; x++) {
            int temp;
            for (int y = 0; y < n; y++) {
                if (y + 1 < n) {
                    swap(arr, x, y, x, y + 1);
                    temp = check(arr, x, y, x, y + 1);
                    count = Math.max(temp, count);
                    swap(arr, x, y + 1, x, y);
                }

                if (x + 1 < n) {
                    swap(arr, x, y, x + 1, y);
                    temp = check(arr, x, y, x + 1, y);
                    count = Math.max(temp, count);
                    swap(arr, x + 1, y, x, y);
                }
            }
        }

        bw.write(String.valueOf(count));
        bw.close();
    }
}
