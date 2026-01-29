package baekjoon.bronze.level2.test_6502;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int idx = 1;

        while (!input.equals("0")) {
            String[] arr = input.split(" ");

            isValid(idx++, arr);

            input = br.readLine();
        }
    }

    private static void isValid(int idx, String[] arr) {
        int r = Integer.parseInt(arr[0]);
        int w = Integer.parseInt(arr[1]);
        int l = Integer.parseInt(arr[2]);

        System.out.print("Pizza " + idx);
        if (r + r >= Math.sqrt(w * w + l * l)) {
            System.out.println(" fits on the table.");
        } else {
            System.out.println(" does not fit on the table.");
        }
    }
}
