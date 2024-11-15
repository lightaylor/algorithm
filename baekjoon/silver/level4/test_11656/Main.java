package silver.level4.test_11656;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = new String[input.length()];

        for (int i = 0; i < input.length(); i++) {
            arr[i] = input.substring(i);
        }

        Arrays.sort(arr);
        for (String str : arr) {
            System.out.println(str);
        }
    }
}
