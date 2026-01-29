package baekjoon.bronze.level1.test_24416.java;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        bw.write(fib(input) + " " + fibonacci(input));
        bw.close();
    }

    public static int fib(int n) {
        if(n == 1 || n == 2) return 1;
        else {
            return fib(n - 1) + fib (n - 2);
        }
    }

    public static int fibonacci(int n) {
        return n - 2;
    }
}
