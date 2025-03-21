package bronze.level2.test_2675.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            StringBuilder result = new StringBuilder();
            String[] s = sc.nextLine().split(" ");
            int j = Integer.parseInt(s[0]);
            char[] c = s[1].toCharArray();

            for (char value : c)
                result.append(Character.toString(value).repeat(j));
            System.out.println(result.toString().trim());
        }
    }
}
