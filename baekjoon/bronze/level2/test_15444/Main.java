package bronze.level2.test_15444;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[][] grid = {
                {"***", "*.*", "***", "*.*", "*.*"},
                {"***", "*.*", "***", "*.*", "***"},
                {"***", "*..", "*..", "*..", "***"},
                {"***", "*.*", "*.*", "*.*", "***"},
                {"***", "*..", "***", "*..", "***"}
        };
        int n = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        String[] answer = {"", "", "", "", ""};

        for (char c : arr) {
            for (int i = 0; i < 5; i++) {
                switch (c) {
                    case 'A':
                        answer[i] += grid[0][i];
                        break;
                    case 'B':
                        answer[i] += grid[1][i];
                        break;
                    case 'C':
                        answer[i] += grid[2][i];
                        break;
                    case 'D':
                        answer[i] += grid[3][i];
                        break;
                    case 'E':
                        answer[i] += grid[4][i];
                        break;
                }
            }
        }

        for (String ans : answer) {
            bw.write(ans);
            bw.newLine();
        }
        bw.close();
    }
}
