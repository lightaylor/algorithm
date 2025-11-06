package gold.level3.test_2143;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int A = sc.nextInt();
        int[] aArr = new int[A];
        for (int i = 0; i < A; i++) aArr[i] = sc.nextInt();

        int B = sc.nextInt();
        int[] bArr = new int[B];
        for (int i = 0; i < B; i++) bArr[i] = sc.nextInt();

        Map<Long, Integer> aMap = new HashMap<>();
        for (int i = 0; i < A; i++) {
            long sum = 0;
            for (int j = i; j < A; j++) {
                sum += aArr[j];
                aMap.put(sum, aMap.getOrDefault(sum, 0) + 1);
            }
        }

        Map<Long, Integer> bMap = new HashMap<>();
        for (int i = 0; i < B; i++) {
            long sum = 0;
            for (int j = i; j < B; j++) {
                sum += bArr[j];
                bMap.put(sum, bMap.getOrDefault(sum, 0) + 1);
            }
        }

        long answer = 0;
        for (Long a : aMap.keySet()) {
            Long b = T - a;
            if (bMap.containsKey(b)) answer += (long) aMap.get(a) * bMap.get(b);
        }

        System.out.print(answer);
    }
}
