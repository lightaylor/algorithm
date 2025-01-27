package bronze.level1.test_1357.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder input = new StringBuilder(sc.nextLine()).reverse();
        String[] arr = input.toString().split(" ");

        int sum = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
        StringBuilder sb = new StringBuilder(String.valueOf(sum));
        System.out.print(Integer.parseInt(sb.reverse().toString()));
    }
}
