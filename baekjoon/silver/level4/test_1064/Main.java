package silver.level4.test_1064;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] A = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        int[] B = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        int[] C = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

        if (ccw(A, B, C) == 0) {
            System.out.print(-1);
        } else {
            double[] perimeterArr = {getPerimeter(A, B), getPerimeter(A, C), getPerimeter(B, C)};
            Arrays.sort(perimeterArr);

            double answer = (perimeterArr[2] - perimeterArr[0]) * 2;
            System.out.print(answer);
        }
    }

    private static int ccw(int[] A, int[] B, int[] C) {
        return (B[0] - A[0]) * (C[1] - A[1]) - (B[1] - A[1]) * (C[0] - A[0]);
    }

    private static double getPerimeter(int[] A, int[] B) {
        int dx = A[0] - B[0];
        int dy = A[1] - B[1];

        return Math.sqrt(dx * dx + dy * dy);
    }
}
