package gold.level3.test_2812;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();

        int count = 0;
        char[] arr = sc.nextLine().toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : arr) {
            count = getCount(c, stack, count, k);
            stack.push(c);
        }

        for (int i = 0; i < k - count; i++) {
            stack.pop();
        }

        StringBuilder sb = new StringBuilder();
        stack.forEach(sb::append);
        System.out.print(sb);
    }

    private static int getCount(char c, Stack<Character> stack, int count, int k) {
        while (!stack.isEmpty() && count < k) {
            if (stack.peek() < c) {
                stack.pop();
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
