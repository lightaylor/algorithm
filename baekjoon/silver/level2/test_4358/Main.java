package silver.level2.test_4358;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new TreeMap<>();
        int total = 0;

        while (sc.hasNextLine()) {
            String tree = sc.nextLine();
            if (tree.isEmpty()) continue;
            map.put(tree, map.getOrDefault(tree, 0) + 1);
            total++;
        }

        for (String key : map.keySet()) {
            double percentage = (double) map.get(key) / total * 100;
            System.out.printf("%s %.4f%n", key, percentage);
        }
    }
}
