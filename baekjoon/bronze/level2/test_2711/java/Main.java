package bronze.level2.test_2711.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            int index = Integer.parseInt(input[0]);
            String str = input[1];
            String answer = str.substring(0, index - 1) + str.substring(index);
            System.out.println(answer);
        }
    }
}
