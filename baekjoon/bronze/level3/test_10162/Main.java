package bronze.level3.test_10162;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        int remainSec = n;
        int[] time = new int[]{300, 60, 10};
        for (int i = 0; i < time.length; i++) {
            sb.append(remainSec/time[i] + " ");
            remainSec %= time[i];
        }
        if (remainSec > 0) {
            System.out.print("-1");
        } else {
            System.out.print(sb);
        }
    }

}
