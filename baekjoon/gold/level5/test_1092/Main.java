package gold.level5.test_1092;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Integer[] cranes = new Integer[n];
        for (int i = 0; i < n; i++) {
            cranes[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        List<Integer> boxes = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            boxes.add(sc.nextInt());
        }

        Arrays.sort(cranes, Collections.reverseOrder());
        boxes.sort(Collections.reverseOrder());
        if (boxes.get(0) > cranes[0]) {
            System.out.print(-1);
            return;
        }

        int count = 0;
        while (!boxes.isEmpty()) {
            count++;
            Iterator<Integer> iter = boxes.iterator();
            for (int i = 0; i < n && iter.hasNext(); ) {
                int box = iter.next();
                if (cranes[i] >= box) {
                    iter.remove();
                    i++;
                }
            }
        }
        System.out.print(count);
    }
}
