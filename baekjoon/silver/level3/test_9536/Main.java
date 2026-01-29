package baekjoon.silver.level3.test_9536;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        while (n-- > 0) {
            String[] foxWeeping = sc.nextLine().split(" ");
            String exitCommand = "what does the fox say?";
            Set<String> set = new HashSet<>();

            while (true) {
                String input = sc.nextLine();
                if (input.equals(exitCommand)) break;

                String[] arr = input.split(" ");
                set.add(arr[2]);
            }


            StringBuilder sb = new StringBuilder();
            for (String weeping : foxWeeping) {
                if (!set.contains(weeping)) sb.append(weeping).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}
