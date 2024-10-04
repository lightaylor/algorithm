package gold.level3.test_1248;

import java.io.*;

public class Main {
    private static int n;
    private static int[] answer;
    private static int[][] sign;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        answer = new int[n];
        sign = new int[n][n];
        String s = br.readLine();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                char x = s.charAt(cnt);
                if (x == '0') {
                    sign[i][j] = 0;
                } else if (x == '+') {
                    sign[i][j] = 1;
                } else {
                    sign[i][j] = -1;
                }
                cnt += 1;
            }
        }
        go(0);
        for (int i = 0; i < n; i++) {
            bw.write(answer[i] + " ");
        }
        bw.close();
    }

    private static boolean check(int index) {
        int sum = 0;
        for (int i = index; i >= 0; i--) {
            sum += answer[i];
            if (sign[i][index] == 0) {
                if (sum != 0) return false;
            } else if (sign[i][index] < 0) {
                if (sum >= 0) return false;
            } else if (sign[i][index] > 0) {
                if (sum <= 0) return false;
            }
        }
        return true;
    }

    private static boolean go(int index) {
        if (index == n) {
            return true;
        }

        if (sign[index][index] == 0) {
            answer[index] = 0;
            return check(index) && go(index + 1);
        }

        for (int i = 1; i <= 10; i++) {
            answer[index] = sign[index][index] * i;
            if (check(index) && go(index+1)) return true;
        }
        return false;
    }
}
