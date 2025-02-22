package gold.level1.test_1700;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int answer = 0;
        int[] items = new int[k];
        for (int i = 0; i < k; i++) items[i] = sc.nextInt();

        Set<Integer> multiTap = new HashSet<>();
        for (int i = 0; i < k; i++) {
            if (multiTap.contains(items[i])) continue;
            if (multiTap.size() < n) {
                multiTap.add(items[i]);
                continue;
            }
            answer++;
            multiTap.remove(findDeviceToUnplug(multiTap, items, i));
            multiTap.add(items[i]);
        }
        System.out.print(answer);
    }

    private static int findDeviceToUnplug(Set<Integer> multiTap, int[] items, int currentIndex) {
        Map<Integer, Integer> lastUse = new HashMap<>();

        for (int device : multiTap) {
            lastUse.put(device, Integer.MAX_VALUE);

            for (int j = currentIndex + 1; j < items.length; j++) {
                if (items[j] == device) {
                    lastUse.put(device, j);
                    break;
                }
            }
        }
        return Collections.max(lastUse.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
