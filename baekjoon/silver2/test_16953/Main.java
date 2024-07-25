package silver2.test_16953;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        String a = arr[0];
        String b = arr[1];
        int answer = 1;

        while (!b.equals(a)) {
            if (b.isEmpty()) {
                answer = -1;
                break;
            }

            if (Long.parseLong(b) % 2 == 0) {
                b = String.valueOf(Long.parseLong(b) / 2);
                answer += 1;
            } else if (b.charAt(b.length() - 1) == '1') {
                b = b.substring(0, b.length() - 1);
                answer += 1;
            } else {
                answer = -1;
                break;
            }
        }

        bw.write(String.valueOf(answer));
        bw.close();
    }
}