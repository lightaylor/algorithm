package silver5.test_1193;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int line = 1, temp = 1;

        while (n > temp) {
            line++;
            temp += line;
        }

        temp = n - temp + line - 1;
        if (line % 2 == 0) bw.write(temp + 1 + "/" + (line - temp));
        else bw.write(line - temp + "/" + (temp + 1));
        bw.close();
    }
}
