package silver.level4.test_1015;

import java.util.ArrayList;
import java.util.Comparator;
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

        class Pair {
            int value;
            int index;

            Pair(int value, int index) {
                this.value = value;
                this.index = index;
            }
        }

        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Pair(arr[i], i));
        }

        list.sort(Comparator.comparingInt(p -> p.value));

        int[] P = new int[n];
        for (int i = 0; i < n; i++) {
            Pair p = list.get(i);
            P[p.index] = i;
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append(P[i]).append(" ");
        }
        System.out.print(sb.toString().trim());
    }
}
