package bronze.level3.test_9723;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
            Arrays.sort(arr);

            double m = Math.pow(arr[0], 2) + Math.pow(arr[1], 2);
            System.out.print("Case #" + (i + 1) + ": ");
            if (Math.pow(arr[2], 2) == m) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
