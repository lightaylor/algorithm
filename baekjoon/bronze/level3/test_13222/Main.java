package bronze.level3.test_13222;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int d = (int) Math.sqrt(w * w + h * h);
        int max = Math.max(w, Math.max(h, d));

        for (int i = 0; i < n; i++) {
            if (sc.nextInt() > max) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
