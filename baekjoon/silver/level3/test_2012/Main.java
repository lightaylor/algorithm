package silver.level3.test_2012;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];

        List<Integer> extra = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num > n) extra.add(num);
            else arr[num]++;
        }

        List<Integer> missing = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (arr[i] == 0) missing.add(i);
            else if (arr[i] > 1) {
                for (int j = 0; j < arr[i] - 1; j++) extra.add(i);
            }
        }

        Collections.sort(extra);
        long answer = 0;
        for (int i = 0; i < missing.size(); i++) answer += Math.abs(extra.get(i) - missing.get(i));
        System.out.print(answer);
    }
}
