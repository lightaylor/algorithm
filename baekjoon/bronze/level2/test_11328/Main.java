package bronze.level2.test_11328;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            int[] arr = new int[58];
            String[] str = sc.nextLine().split(" ");
            for (char c : str[0].toCharArray()) arr[c - 'A'] += 1;
            for (char c : str[1].toCharArray()) arr[c - 'A'] -= 1;

            boolean possible = true;
            for (int j : arr)
                if (j != 0) {
                    possible = false;
                    break;
                }
            System.out.println(possible ? "Possible" : "Impossible");
        }
    }
}
