package baekjoon.gold.level4.test_30805;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = getSequence(sc);
        int[] b = getSequence(sc);

        int ia = 0, ib = 0;
        StringBuilder ans = new StringBuilder();
        int count = 0;

        for (int v = 100; v >= 1; v--) {
            int ta = ia, tb = ib;
            while (true) {
                while (ta < a.length && a[ta] != v) ta++;
                while (tb < b.length && b[tb] != v) tb++;
                if (ta < a.length && tb < b.length) {
                    ans.append(v).append(' ');
                    count++;
                    ia = ++ta;
                    ib = ++tb;
                } else break;
            }
        }

        System.out.println(count);
        if (count > 0) System.out.println(ans.toString().trim());
    }

    private static int[] getSequence(Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        return arr;
    }
}
