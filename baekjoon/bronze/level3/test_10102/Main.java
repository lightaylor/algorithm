package baekjoon.bronze.level3.test_10102;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[2];

        String input = sc.nextLine();
        for (int i = 0; i < n; i++) {
            arr[input.charAt(i) - 'A']++;
        }

        if (arr[0] == arr[1]) System.out.print("Tie");
        else System.out.print(arr[0] > arr[1] ? "A" : "B");
    }
}
