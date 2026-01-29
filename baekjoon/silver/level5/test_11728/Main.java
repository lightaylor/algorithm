package baekjoon.silver.level5.test_11728;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[] AArr = new int[A];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) {
            AArr[i] = Integer.parseInt(st.nextToken());
        }

        int[] BArr = new int[B];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < B; i++) {
            BArr[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        while (i < A && j < B) {
            if (AArr[i] < BArr[j]) {
                sb.append(AArr[i++]).append(" ");
            } else {
                sb.append(BArr[j++]).append(" ");
            }
        }

        while(i < A) {
            sb.append(AArr[i++]).append(" ");
        }

        while(j < B) {
            sb.append(BArr[j++]).append(" ");
        }

        System.out.print(sb.toString().trim());
    }
}
