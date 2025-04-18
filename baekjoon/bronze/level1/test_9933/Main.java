package bronze.level1.test_9933;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            StringBuilder str = new StringBuilder(sc.nextLine());
            set.add(str.toString());
            if (set.contains(str.reverse().toString())) {
                System.out.print(str.length() + " " + str.charAt(str.length() / 2));
                break;
            }
        }
    }
}
