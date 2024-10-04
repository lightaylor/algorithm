package silver.level5.test_1543;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String word = br.readLine();
        int count = 0;

        while (input.contains(word)) {
            input = input.replaceFirst(word,  " ".repeat(word.length()));
            count += 1;
        }

        bw.write(String.valueOf(count));
        bw.close();
    }
}
