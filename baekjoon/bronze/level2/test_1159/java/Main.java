package bronze.level2.test_1159.java;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Map<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            char key = sc.nextLine().charAt(0);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        for (char key : map.keySet()) {
            if (map.get(key) > 4) {
                sb.append(key);
            }
        }
        System.out.print(sb.length() == 0 ? "PREDAJA" : sb);
    }
}
