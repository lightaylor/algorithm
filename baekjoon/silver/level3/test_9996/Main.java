package baekjoon.silver.level3.test_9996;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String pattern = sc.nextLine();
        String[] parts = pattern.split("\\*");

        for (int i = 0; i < n; i++) {
            String filename = sc.nextLine();
            if (filename.startsWith(parts[0]) && filename.endsWith(parts[1]) && filename.length() >= parts[0].length() + parts[1].length()) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}
