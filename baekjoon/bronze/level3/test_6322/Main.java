package bronze.level3.test_6322;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int idx = 1;

        while (!input.equals("0 0 0")) {
            String[] str = input.split(" ");
            System.out.println("Triangle #" + idx++);

            double a = Double.parseDouble(str[0]);
            double b = Double.parseDouble(str[1]);
            double c = Double.parseDouble(str[2]);

            if (a == -1) {
                a = Math.pow(c, 2) - Math.pow(b, 2);
                if (a > 0) {
                    System.out.printf("a = %.3f\n", Math.sqrt(a));
                } else {
                    System.out.println("Impossible.");
                }
            }
            if (b == -1) {
                b = Math.pow(c, 2) - Math.pow(a, 2);
                if (b > 0) {
                    System.out.printf("b = %.3f\n", Math.sqrt(b));
                } else {
                    System.out.println("Impossible.");
                }
            }
            if (c == -1) {
                c = Math.pow(a, 2) + Math.pow(b, 2);
                if (c > 0) {
                    System.out.printf("c = %.3f\n", Math.sqrt(c));
                } else {
                    System.out.println("Impossible.");
                }
            }

            System.out.println();
            input = br.readLine();
        }
    }
}
