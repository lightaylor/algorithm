package silver.level5.test_14916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = -1;
        int five = n / 5;

        while (five >= 0) {
            int remaining = n - (five * 5);

            if (remaining % 2 == 0) {
                answer = five + (remaining / 2);
                break;
            }
            five--;
        }

        System.out.print(answer);
    }
}
