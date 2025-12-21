package bronze.level4.test_26068;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());

        int count = 0;
        while (tc-- > 0) {
            String day = sc.nextLine().replace("D-", "");
            if (Integer.parseInt(day) <= 90) count++;
        }

        System.out.print(count);
    }
}
