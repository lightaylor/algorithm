package gold.level4.test_27172;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        int maxValue = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            maxValue = Math.max(maxValue, arr[i]);
        }

        boolean[] valueArr = new boolean[maxValue + 1];
        int[] frequency = new int[maxValue + 1];

        for (int i : arr) valueArr[i] = true;
        for (int i : arr) {
            for (int j = i + i; j <= maxValue; j += i) {
                if (valueArr[j] && valueArr[i]) {
                    frequency[j]--;
                    frequency[i]++;
                }
            }
        }


        StringBuilder sb = new StringBuilder();
        for (int i : arr) sb.append(frequency[i]).append(" ");
        System.out.print(sb.toString().trim());
    }
}
