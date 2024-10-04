package silver.level5.test_1010;

import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int total = Integer.parseInt(br.readLine());

        for(int t = 0; t < total; t++) {
            bw.write(getLegCount(br.readLine()) + "\n");
        }
        bw.close();
    }

    public static long getLegCount(String input) {
        String[] str = input.split(" ");
        List<BigInteger> arr = new ArrayList<>();

        BigInteger sum = new BigInteger("1");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        if (n == 1) return m;
        else if (n == m) return 1;
        else {
            for (int i = 1; i <= m; i++) {
                sum = sum.multiply(new BigInteger(String.valueOf(i)));
                arr.add(sum);
            }
        }

        return Long.valueOf(String.valueOf(arr.get(m-1).divide(arr.get(n-1).multiply(arr.get(m-n-1)))));
    }
}
