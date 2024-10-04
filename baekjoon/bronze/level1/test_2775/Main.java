package bronze.level1.test_2775;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int total = Integer.parseInt(br.readLine());

        for(int i = 0; i < total; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            bw.write(resident(k, n) + "\n");
        }
        bw.close();
    }

    public static int resident(int k, int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1;  i <= n; i++) {
            list.add(i);
        }

        for (int i = 1; i <= k; i++) {
            list.add(1);
            for (int j = 2; j <= n; j++) {
                list.add(list.get(list.size() - 1) + list.get(list.size() - n));
            }
        }

        return list.get(list.size() - 1);
    }
}
