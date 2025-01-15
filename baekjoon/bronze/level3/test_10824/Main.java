package bronze.level3.test_10824;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");

        long answer = Long.parseLong(arr[0] + arr[1]) + Long.parseLong(arr[2] + arr[3]);
        System.out.print(answer);
    }
}
