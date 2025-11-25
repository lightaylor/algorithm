package gold.level2.test_12015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> list = new ArrayList<>();
        for (int x : arr) {
            int pos = Collections.binarySearch(list, x);
            if (pos < 0) pos = -(pos + 1);

            if (pos == list.size()) {
                list.add(x);
            } else {
                list.set(pos, x);
            }
        }
        System.out.print(list.size());
    }
}
