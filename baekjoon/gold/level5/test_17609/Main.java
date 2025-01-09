package gold.level5.test_17609;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < t; i++) {
            char[] str = sc.nextLine().toCharArray();

            int left = 0;
            int right = str.length - 1;
            int count = 0;
            while (left < right) {
                if (str[left] != str[right]) {
                    if (isPalindrome(str, left + 1, right) || isPalindrome(str, left, right - 1)) {
                        count = 1;
                    } else {
                        count = 2;
                    }
                    break;
                }
                left++;
                right--;
            }
            System.out.println(count);
        }
    }

    private static boolean isPalindrome(char[] str, int left, int right) {
        while (left < right) {
            if (str[left] != str[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
