package silver.level2.test_1254;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        for (int i = 0; i < S.length(); i++) {
            boolean isPal = true;
            int l = i, r = S.length() - 1;
            while (l < r) {
                if (S.charAt(l) != S.charAt(r)) {
                    isPal = false;
                    break;
                }
                l++;
                r--;
            }
            if (isPal) {
                System.out.print(S.length() + i);
                break;
            }
        }
    }
}
