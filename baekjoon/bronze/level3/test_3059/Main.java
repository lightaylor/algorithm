package baekjoon.bronze.level3.test_3059;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            int sum = 2015;
            char[] arr = sc.nextLine().toCharArray();
            Set<Character> set = new LinkedHashSet<>();
            for (char c : arr) set.add(c);
            for (char c : set) sum -= c;
            System.out.println(sum);
        }
    }
}
