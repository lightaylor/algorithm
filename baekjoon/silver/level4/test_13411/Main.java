package silver.level4.test_13411;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        TreeMap<Double, TreeSet<Integer>> map = new TreeMap<>();

        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int v = sc.nextInt();

            double second = Math.sqrt(x * x + y * y) / v;
            map.computeIfAbsent(second, k -> new TreeSet<>()).add(i);
        }

        for (TreeSet<Integer> set : map.values()) {
            for (int idx : set) {
                System.out.println(idx);
            }
        }
    }
}
