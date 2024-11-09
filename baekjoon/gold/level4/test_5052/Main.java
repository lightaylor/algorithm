package gold.level4.test_5052;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            String[] numbers = new String[n];
            for (int j = 0; j < n; j++) {
                numbers[j] = sc.next();
            }

            Arrays.sort(numbers);

            String answer = "YES";
            for (int j = 0; j < n - 1; j++) {
                if (numbers[j + 1].startsWith(numbers[j])) {
                    answer = "NO";
                    break;
                }
            }

            System.out.println(answer);
        }
    }
}
