package bronze3.test_2754;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        double answer = 69 - input.charAt(0);

        switch (input.charAt(1)) {
            case '+':
                answer += 0.3;
                break;
            case '-':
                answer -= 0.3;
                break;
        }

        bw.write(String.valueOf(answer));
        bw.close();
    }
}
