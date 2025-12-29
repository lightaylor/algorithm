package bronze.level1.test_10823;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        StringBuilder sb = new StringBuilder();
        while (true) {
            String input = sc.nextLine();
            sb.append(input);
            if (!sc.hasNext()) break;
        }

        String[] num = sb.toString().split(",");
        for (String n : num) sum += Integer.parseInt(n);
        System.out.print(sum);
    }
}
