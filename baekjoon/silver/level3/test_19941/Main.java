package silver.level3.test_19941;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();

        int answer = 0;
        char[] arr = sc.nextLine().toCharArray();
        for (int i = 0; i < n; i++) {
            char c = arr[i];

            if (c == 'P') {
                int start = Math.max(0, i - k);
                int end = Math.min(n - 1, i + k);
                for (int j = start; j <= end; j++) {
                    if (arr[j] == 'H') {
                        answer++;
                        arr[j] = 'X';
                        break;
                    }
                }
            }
        }
        System.out.print(answer);
    }
}
