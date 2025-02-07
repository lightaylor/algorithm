package bronze.level1.test_2693;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(arr);
            System.out.println(arr[7]);
        }
    }
}
