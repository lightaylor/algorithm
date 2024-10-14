package bronze.level3.test_7510;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[3];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[0] = (int) Math.pow(Integer.parseInt(st.nextToken()), 2);
            arr[1] = (int) Math.pow(Integer.parseInt(st.nextToken()), 2);
            arr[2] = (int) Math.pow(Integer.parseInt(st.nextToken()), 2);

            Arrays.sort(arr);

            System.out.println("Scenario #" + (i+1) + ":");
            if (arr[0] + arr[1] == arr[2]) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            System.out.println();
        }

    }
}
