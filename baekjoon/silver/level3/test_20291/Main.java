package baekjoon.silver.level3.test_20291;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] file = sc.nextLine().split("\\.");
            map.put(file[1], map.getOrDefault(file[1], 0) + 1);
        }

        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
