package bronze.level2.test_11816;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();

        if (x.startsWith("0x")) System.out.print(Integer.parseInt(x.substring(2), 16));
        else if (x.startsWith("0")) System.out.print(Integer.parseInt(x.substring(1), 8));
        else System.out.print(Integer.parseInt(x));
    }
}
