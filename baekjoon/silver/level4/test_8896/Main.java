package silver.level4.test_8896;

import java.io.*;
import java.util.Arrays;

public class Main {
    private static int[] winners;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            String[] computer = new String[m];

            for (int j = 0; j < m; j++) {
                computer[j] = br.readLine();
            }

            winners = new int[m];
            Arrays.fill(winners, 1);

            for (int j = 0; j < computer[0].length(); j++) {
                String round = "";
                for (int k = 0; k < m; k++) {
                    round += winners[k] == 1 ? computer[k].charAt(j) : "X";
                }

                if (round.contains("R")) {
                    if (round.contains("S") && !round.contains("P")) {
                        findWinner('R', round);
                    } else if (!round.contains("S") && round.contains("P")) {
                        findWinner('P', round);
                    }
                } else if (round.contains("S")) {
                    if (round.contains("R") && !round.contains("P")) {
                        findWinner('R', round);
                    } else if (!round.contains("R") && round.contains("P")) {
                        findWinner('S', round);
                    }
                }  else if (round.contains("P")) {
                    if (round.contains("R") && !round.contains("S")) {
                        findWinner('P', round);
                    } else if (!round.contains("R") && round.contains("S")) {
                        findWinner('S', round);
                    }
                }
            }

            if (Arrays.stream(winners).sum() == 1) {
                for (int j = 0; j < winners.length; j++) {
                    if (winners[j] == 1) {
                        bw.write(String.valueOf(j + 1));
                        break;
                    }
                }
            } else {
                bw.write("0");
            }
            bw.newLine();
        }
        bw.close();
    }

    private static void findWinner (char str, String com) {
        char[] arr = com.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != str) {
                winners[i] = 0;
            }
        }
    }
}
