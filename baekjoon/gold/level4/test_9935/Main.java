package gold.level4.test_9935;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final String string = br.readLine();
        final String bomb = br.readLine();
        StringBuilder answer = new StringBuilder("");
        int bombLength = bomb.length();

        for (int i = 0; i < string.length(); i++) {
            answer.append(string.charAt(i));
            if (answer.length() >= bombLength &&
                answer.substring(answer.length() - bombLength, answer.length()).equals(bomb)) {
                answer.delete(answer.length() - bombLength, answer.length());
            }
        }

        bw.write(answer.isEmpty() ? "FRULA" : answer.toString());
        bw.close();
    }
}
