package baekjoon.bronze.level4.test_25640;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String target = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());

        int count = 0;
        for (int i = 0; i < n; i++) {
            count += target.equals(sc.nextLine()) ? 1 : 0;
        }
        System.out.print(count);
    }
}
