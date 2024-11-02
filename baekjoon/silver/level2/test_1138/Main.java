package silver.level2.test_1138;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] line = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int count = line[i];
            for (int j = 0; j < n; j++) {
                if (result[j] == 0) {
                    if (count == 0) {
                        result[j] = i + 1;
                        break;
                    } else {
                        count--;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i : result) {
            sb.append(i).append(" ");
        }
        System.out.print(sb.toString().trim());
    }
}
