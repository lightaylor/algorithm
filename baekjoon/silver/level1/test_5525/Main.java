package silver.level1.test_5525;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        char[] S = sc.nextLine().toCharArray();

        int answer = 0;
        int count = 0;
        for (int i = 1; i < M - 1; i++) {
            if (S[i - 1] == 'I' && S[i] == 'O' && S[i + 1] == 'I') {
                count++;
                i++;
                if (count == N) {
                    answer++;
                    count--;
                }
            } else {
                count = 0;
            }
        }
        System.out.print(answer);
    }
}
