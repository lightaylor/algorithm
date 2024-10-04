package silver3.test_9095;

import java.io.*;

// 재귀함수 풀이
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++) {
            int n = Integer.parseInt(br.readLine());
            bw.write(String.valueOf(go(0, n)));
            bw.newLine();
        }

        bw.close();
    }

    private static int go(int sum, int goal) {
        if (sum > goal) return 0;
        if (sum == goal) return 1;

        int answer = 0;
        for (int i = 1; i <= 3; i++) {
             answer += go(sum + i, goal);
         }

        return answer;
    }
}

// DP 풀이
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int count = Integer.parseInt(br.readLine());
//        int[] dp = new int[11];
//        dp[0] = 1;
//        dp[1] = 2;
//        dp[2] = 4;
//
//        for(int i = 3; i < 11; i++) {
//            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
//        }
//
//        for(int i = 0; i < count; i++) {
//            bw.write(String.valueOf(dp[Integer.parseInt(br.readLine()) -  1]));
//            bw.newLine();
//        }
//
//        bw.close();
//    }
//}
