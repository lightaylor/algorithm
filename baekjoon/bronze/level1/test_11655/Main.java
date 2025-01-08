package bronze.level1.test_11655;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toCharArray();

        StringBuilder sb = new StringBuilder();
        for (char c : s) {
            int temp = c;

            if (65 <= temp && temp <= 90) {
                temp = temp + 13 > 90 ? temp - 13 : temp + 13;
            } else if (97 <= temp && temp <= 122) {
                temp = temp + 13 > 122 ? temp - 13 : temp + 13;
            }
            sb.append((char) temp);
        }
        System.out.print(sb);
    }
}
