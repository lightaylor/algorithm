package baekjoon.gold.level4.test_7662;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(sc.nextLine());
            TreeMap<Integer, Integer> map = new TreeMap<>();

            for (int j = 0; j < k; j++) {
                String[] arr = sc.nextLine().split(" ");
                int value = Integer.parseInt(arr[1]);

                switch (arr[0]) {
                    case "I":
                        map.put(value, map.getOrDefault(value, 0) + 1);
                        break;
                    case "D":
                        if (!map.isEmpty()) {
                            int key = value == 1 ? map.lastKey() : map.firstKey();
                            if (map.put(key, map.get(key) - 1) == 1) {
                                map.remove(key);
                            }
                        }
                        break;
                }
            }

            if (map.isEmpty()) {
                System.out.println("EMPTY");
            } else {
                System.out.println(map.lastKey() + " " + map.firstKey());
            }
        }
    }
}
