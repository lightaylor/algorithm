package silver.level5.test_11723.v3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int M = Integer.parseInt(br.readLine());
        int check = 0;

        for (int i = 0; i < M; i++) {
            String[] str = br.readLine().split(" ");
            int value = str.length > 1 ? Integer.parseInt(str[1]) : 0;

            switch (str[0]) {
                case "add":
                    check |= (1 << value);
                    break;
                case "remove":
                    check &= ~(1 << value);
                    break;
                case "check":
                    bw.write(((check & (1 << value)) != 0 ? 1 : 0) + "\n");
                    break;
                case "toggle":
                    check ^= (1 << value);
                    break;
                case "all":
                    check = (1 << 21) - 1;
                    break;
                case "empty":
                    check = 0;
                    break;
            }
        }
        bw.close();
    }
}
