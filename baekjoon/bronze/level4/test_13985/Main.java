package bronze.level4.test_13985;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int sum = 0;

        switch (input[1]) {
            case "+":
                sum = Integer.parseInt(input[0]) + Integer.parseInt(input[2]);
                break;
            case "-":
                sum = Integer.parseInt(input[0]) - Integer.parseInt(input[2]);
                break;
            case "*":
                sum = Integer.parseInt(input[0]) * Integer.parseInt(input[2]);
                break;
            case "/":
                sum = Integer.parseInt(input[0]) / Integer.parseInt(input[2]);
                break;
        };

        bw.write(sum == Integer.parseInt(input[4]) ? "YES" : "NO");
        bw.close();
    }
}
