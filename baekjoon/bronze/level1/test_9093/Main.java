package bronze.level1.test_9093;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] arr = sc.nextLine().split(" ");

            StringBuilder answer = new StringBuilder();
            StringBuilder sb;
            for (String s : arr) {
                sb = new StringBuilder(s).reverse();
                answer.append(sb).append(" ");
            }
            System.out.println(answer.toString().trim());
        }
    }
}
