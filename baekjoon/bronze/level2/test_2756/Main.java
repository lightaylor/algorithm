package bronze.level2.test_2756;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int player1 = getScore(sc);
            int player2 = getScore(sc);

            StringBuilder sb = new StringBuilder("SCORE: " + player1 + " to " + player2 + ", ");
            if (player1 > player2) sb.append("PLAYER 1 WINS.");
            else if (player1 < player2) sb.append("PLAYER 2 WINS.");
            else sb.append("TIE.");

            System.out.println(sb);
        }
    }

    private static int getScore(Scanner sc) {
        int score = 0;

        for (int j = 0; j < 3; j++) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double distance = Math.sqrt(x * x + y * y);

            if (distance <= 3) score += 100;
            else if (distance <= 6) score += 80;
            else if (distance <= 9) score += 60;
            else if (distance <= 12) score += 40;
            else if (distance <= 15) score += 20;
        }

        return score;
    }
}
