package bronze.level2.test_1212;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String octal = sc.nextLine();

        StringBuilder binary = new StringBuilder();

        binary.append(Integer.toBinaryString(octal.charAt(0) - '0'));

        for (int i = 1; i < octal.length(); i++) {
            binary.append(String.format("%3s", Integer.toBinaryString(octal.charAt(i) - '0')).replace(' ', '0'));
        }

        System.out.print(binary);
    }
}
