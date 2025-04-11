package bronze.level2.test_2495;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            char[] arr = sc.nextLine().toCharArray();
            int max = 0;
            int count = 1;
            for (int j = 1; j < arr.length; j++) {
                if (arr[j - 1] == arr[j]) {
                    count++;
                } else {
                    max = Math.max(max, count);
                    count = 1;
                }
            }
            max = Math.max(max, count);
            System.out.println(max);
        }
    }
}
