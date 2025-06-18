package gold.level5.test_1013;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String regex = "(100+1+|01)+";

        for (int i = 0; i < n; i++) {
            String num = sc.nextLine();
            boolean bool = Pattern.matches(regex, num);
            System.out.println(bool ? "YES" : "NO");
        }
    }
}
