package baekjoon.silver.level5.test_14405;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pikachu = sc.nextLine();

        String[] arr = {"pi", "ka", "chu"};

        for (String str : arr) {
            pikachu = pikachu.replaceAll(str, " ");
        }

        System.out.print(pikachu.trim().length() == 0 ? "YES" : "NO");
    }
}
