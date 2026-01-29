package baekjoon.gold.level4.test_22942;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            list.add(new int[]{x - y, i});
            list.add(new int[]{x + y, i});
        }

        list.sort(Comparator.comparingInt(a -> a[0]));

        Stack<Integer> stack = new Stack<>();
        for (int[] arr : list) {
            int idx = arr[1];
            if (!stack.isEmpty()) {
                if (stack.peek() == idx) {
                    stack.pop();
                } else {
                    stack.push(idx);
                }
            } else {
                stack.push(idx);
            }
        }

        if (stack.isEmpty()) System.out.print("YES");
        else System.out.print("NO");
    }
}
