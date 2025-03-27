package silver.level5.test_1769;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] x = sc.nextLine().toCharArray();

        int count = 0;
        while (x.length > 1) {
            int sum = 0;
            for (char c : x) {
                sum += Character.getNumericValue(c);
            }
            x = String.valueOf(sum).toCharArray();
            count++;
        }

        System.out.println(count);
        System.out.println(Character.getNumericValue(x[0]) % 3 == 0 ? "YES" : "NO");
    }
}
