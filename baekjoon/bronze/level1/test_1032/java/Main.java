package baekjoon.bronze.level1.test_1032.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String[] files = new String[N];
        for (int i = 0; i < N; i++) {
            files[i] = sc.next();
        }

        boolean[] diff = new boolean[files[0].length()];
        for (int i = 0; i < files[0].length(); i++) {
            char current = files[0].charAt(i);
            for (int j = 0; j < N; j++) {
                if (!diff[i] && current != files[j].charAt(i)) {
                    diff[i] = true;
                    break;
                }
            }
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < files[0].length(); i++) {
            if (diff[i]) {
                answer.append("?");
            } else {
                answer.append(files[0].charAt(i));
            }
        }
        System.out.print(answer);
    }

}
