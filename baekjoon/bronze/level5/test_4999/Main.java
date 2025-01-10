package bronze.level5.test_4999;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] jaehwan = sc.nextLine().toCharArray();
        char[] doctor = sc.nextLine().toCharArray();

        boolean answer = true;
        for (int i = 0; i < jaehwan.length; i++) {
            if (jaehwan[i] != doctor[i]) {
                answer = jaehwan[i] != 'h';
                break;
            }
        }
        System.out.print(answer ? "go" : "no");
    }
}
