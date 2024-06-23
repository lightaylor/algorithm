package test_10814;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[][] users = new String[n][2];

        for (int i = 0; i < n; i++) {
            users[i] = br.readLine().split(" ");
        }

        Arrays.sort(users, Comparator.comparingInt(o -> Integer.parseInt(o[0])));

        for (String[] user : users) {
            bw.write(user[0] + " " + user[1]);
            bw.newLine();
        }

        bw.close();
    }
}
