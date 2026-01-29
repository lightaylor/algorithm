package baekjoon.silver.level5.test_25757;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");

        Map<String, Integer> map = new HashMap<>();
        map.put("Y", 1);
        map.put("F", 2);
        map.put("O", 3);

        Set<String> set = new HashSet<>();
        for (int i = 0; i < Integer.parseInt(str[0]); i++) {
            set.add(sc.nextLine());
        }

        int maxGroups = set.size() / map.get(str[1]);
        System.out.print(maxGroups);
    }
}
