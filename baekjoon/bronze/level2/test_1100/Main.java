package bronze.level2.test_1100;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        char[] arr = new char[8];
        for (int i = 0; i < 8; i++) {
            arr = sc.nextLine().toCharArray();

            if (i % 2 == 0) {
                for (int j = 0; j < 8; j++) {
                    if (j % 2 == 0 && arr[j] == 'F') {
                        sum++;
                    }
                }
            } else {
                for (int j = 0; j < 8; j++) {
                    if (j % 2 == 1 && arr[j] == 'F') {
                        sum++;
                    }
                }
            }
        }

        System.out.print(sum);
    }
}
