package bronze.level2.test_5586;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String oi = "OI";
        int jCount = 0;
        int iCount = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'J') {
                jCount += str.substring(i + 1, i + 3).equals(oi) ? 1 : 0;
            } else if (str.charAt(i) == 'I')
                iCount += str.substring(i + 1, i + 3).equals(oi) ? 1 : 0;
        }

        System.out.println(jCount);
        System.out.println(iCount);
    }
}
