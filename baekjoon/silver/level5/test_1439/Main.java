package silver.level5.test_1439;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] input = br.readLine().toCharArray();
        char check = input[0];
        int zero = check == '0' ? 1 : 0;
        int one = check == '1' ? 1 : 0;
        for (char c : input) {
            if (c == check) continue;
            if (c == '0') zero++;
            else one++;
            check = c;
        }

        System.out.print(Math.min(zero, one));
    }
}
