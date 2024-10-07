package gold.level4.test_1744;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<Integer> plus = new ArrayList<>();
        List<Integer> minus = new ArrayList<>();
        int zero = 0;
        int one = 0;

        for (int i = 0; i < n; i++) {
            int s = Integer.parseInt(br.readLine());
            if (s > 1) {
                plus.add(s);
            } else if (s < 0) {
                minus.add(s);
            } else if (s == 0){
                zero++;
            } else {
                one++;
            }
        }

        plus.sort(Collections.reverseOrder());
        Collections.sort(minus);

        int answer = 0;
        for (int i = 0; i < plus.size(); i += 2) {
            if (i + 1 < plus.size()) {
                answer += plus.get(i) * plus.get(i + 1);
            } else {
                answer += plus.get(i);
            }
        }

        for (int i = 0; i < minus.size(); i += 2) {
            if (i + 1 < minus.size()) {
                answer += minus.get(i) * minus.get(i + 1);
            } else {
                if (zero == 0) {
                    answer += minus.get(i);
                }
            }
        }

        System.out.print(answer + one);
    }
}
