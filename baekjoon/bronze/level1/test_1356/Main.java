package bronze.level1.test_1356;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();

        for (int i = 1; i < num.length(); i++) {
            char[] first = num.substring(0, i).toCharArray();
            char[] last = num.substring(i).toCharArray();

            int firstCount = 1;
            int lastCount = 1;
            for (char c : first) {
                firstCount *= Character.getNumericValue(c);
            }
            for (char c : last) {
                lastCount *= Character.getNumericValue(c);
            }

            if (firstCount == lastCount) {
                System.out.print("YES");
                return;
            }
        }
        System.out.print("NO");
    }
}
