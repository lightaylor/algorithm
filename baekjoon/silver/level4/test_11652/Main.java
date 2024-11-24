package silver.level4.test_11652;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            long card = Long.parseLong(sc.nextLine());
            map.put(card, map.getOrDefault(card, 0) + 1);
        }

        long answer = Long.MAX_VALUE;
        int maxCount = 0;

        for (Map.Entry<Long, Integer> entry : map.entrySet()) {
            long num = entry.getKey();
            int count = entry.getValue();

            if (maxCount < count || (count == maxCount && num < answer)) {
                answer = num;
                maxCount = count;
            }
        }

        System.out.print(answer);
    }
}
