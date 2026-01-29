package baekjoon.bronze.level3.test_11721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        while(input.length() > 10) {
            String substring = input.substring(0, 10);
            input = input.substring(10);
            System.out.println(substring);
        }
        System.out.println(input);
    }
}
