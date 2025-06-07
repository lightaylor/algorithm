package bronze.level1.test_14626;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();

        int sum = 0;
        int target = 0;
        for (int i = 0; i < 12; i++) {
            char c = arr[i];
            int num = c - '0';
            if (c == '*') target = i % 2 == 0 ? 1 : 3;
            else sum += i % 2 == 0 ? num : num * 3;
        }

        for (int i = 0; i <= 9; i++) {
            int temp = (10 - (sum + i * target) % 10) % 10;
            if (temp == arr[12] - '0') {
                sum = i;
                break;
            }
        }
        System.out.print(sum);
    }
}
