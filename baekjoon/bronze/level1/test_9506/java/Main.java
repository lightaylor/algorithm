package bronze.level1.test_9506.java;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        List<Integer> list;

        while (input != -1) {
            StringBuilder sb = new StringBuilder();
            list = new ArrayList<>();
            int count = 0;
            for (int i = 1; i < input; i++) {
                if (input % i == 0) {
                    count += i;
                    list.add(i);
                }
            }

            if (count == input) {
                sb.append(input + " = ");
                list.forEach(s -> {
                    sb.append(s + " + ");
                });
                bw.write(sb.substring(0, sb.length() - 3) + "\n");
            } else {
                bw.write(input + " is NOT perfect.\n");
            }
            input = Integer.parseInt(br.readLine());
        }
        bw.close();
    }
}
