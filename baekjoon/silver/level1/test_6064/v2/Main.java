package silver.level1.test_6064.v2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());

            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int answer = -1;
            for (int j = x - 1; j < M * N; j += M) {
                if (j % N + 1 == y) {
                    answer = j + 1;
                    break;
                }
            }
            System.out.println(answer);
        }
    }
}
