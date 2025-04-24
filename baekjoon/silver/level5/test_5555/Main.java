package silver.level5.test_5555;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());

        int count = 0;
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            count += (str + str).contains(word) ? 1 : 0;
        }

        System.out.print(count);
    }
}
