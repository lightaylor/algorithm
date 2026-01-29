package baekjoon.bronze.level2.test_11098;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            sc.nextLine();

            String name = "";
            int maxPrice = 0;
            for (int j = 0; j < p; j++) {
                String[] input = sc.nextLine().split(" ");
                int price = Integer.parseInt(input[0]);

                if (price > maxPrice) {
                    name = input[1];
                    maxPrice = price;
                }
            }

            System.out.println(name);
        }
    }
}
