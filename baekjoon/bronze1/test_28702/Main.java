package bronze1.test_28702;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int check = 0;
        int num = 0;
        String answer = "";
        String input = "";
        for (int i = 0; i < 3; i++) {
            input = br.readLine();
            if (input.matches("[0-9]+")) {
                check = i;
                break;
            }
        }
        num = Integer.parseInt(input) + (3 - check);

        if (num % 15 == 0) {
            answer = "FizzBuzz";
        } else if (num % 3 == 0) {
            answer = "Fizz";
        } else if (num % 5 == 0) {
            answer = "Buzz";
        } else {
            answer = String.valueOf(num);
        }
        System.out.print(answer);
    }
}