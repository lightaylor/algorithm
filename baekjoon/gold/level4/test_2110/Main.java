package gold.level4.test_2110;

import java.util.*;

public class Main {
    private static int[] HOUSE;
    private static int N;
    private static int C;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        C = sc.nextInt();

        HOUSE = new int[N];
        for (int i = 0; i < N; i++) HOUSE[i] = sc.nextInt();
        Arrays.sort(HOUSE);

        int left = 0;
        int right = HOUSE[N - 1] - HOUSE[0];
        int answer = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canPlace(mid)) {
                answer = mid;
                left = mid + 1;
            } else right = mid - 1;
        }
        System.out.print(answer);
    }

    private static boolean canPlace(int mid) {
        int count = 1;
        int last = HOUSE[0];

        for (int i = 1; i < N; i++) {
            if (HOUSE[i] - last >= mid) {
                count++;
                last = HOUSE[i];
                if (count >= C) return true;
            }
        }
        return false;
    }
}
