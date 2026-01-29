package baekjoon.silver.level4.test_1302;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String book = sc.nextLine();
            map.put(book, map.getOrDefault(book, 1) + 1);
        }

        String maxBook = "";
        int max = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max || (entry.getValue() == max && entry.getKey().compareTo(maxBook) < 0)) {
                max = entry.getValue();
                maxBook = entry.getKey();
            }
        }
        System.out.print(maxBook);
    }
}
