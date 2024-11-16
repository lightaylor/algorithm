package bronze.level4.test_9772;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String input = sc.nextLine();
            String[] coordinate = input.split(" ");
            double x = Double.parseDouble(coordinate[0]);
            double y = Double.parseDouble(coordinate[1]);

            if (x == 0 || y == 0) {
                System.out.println("AXIS");
            } else if (x > 0 && y > 0) {
                System.out.println("Q1");
            } else if (x > 0 && y < 0) {
                System.out.println("Q4");
            } else if (x < 0 && y > 0) {
                System.out.println("Q2");
            } else {
                System.out.println("Q3");
            }

            if (input.equals("0 0")) {
                break;
            }
        }
    }
}
