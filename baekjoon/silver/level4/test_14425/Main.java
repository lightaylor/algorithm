package silver.level4.test_14425;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Map<String, Integer> map = new HashMap<>();
        int answer = 0;

        for (int i = 0; i < input[0]; i++) {
            map.put(br.readLine(), i);
        }

        for (int i = 0; i < input[1]; i++) {
            if (map.containsKey(br.readLine())) {
                answer += 1;
            }
        }

        bw.write(String.valueOf(answer));
        bw.close();
    }
}
