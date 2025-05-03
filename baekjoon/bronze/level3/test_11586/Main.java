package bronze.level3.test_11586;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        String[] mirror = new String[n];
        for (int i = 0; i < n; i++) mirror[i] = sc.nextLine();
        int k = Integer.parseInt(sc.nextLine());

        if (k == 2) {
            for (int i = 0; i < n; i++) {
                String str = mirror[i];
                mirror[i] = new StringBuilder(str).reverse().toString();
            }
        } else if (k == 3) {
            String[] temp = new String[n];
            for (int i = 0; i < n; i++) temp[i] = mirror[n - i - 1];
            mirror = temp;
        }

        for (String str : mirror) System.out.println(str);
    }
}
