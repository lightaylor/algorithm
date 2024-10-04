package silver.level5.test_3054;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] arr = br.readLine().toCharArray();
        StringBuilder[] lines = {
                new StringBuilder("..#.."),
                new StringBuilder(".#.#."),
                new StringBuilder("#." + arr[0] + ".#"),
                new StringBuilder(".#.#."),
                new StringBuilder("..#..")
        };

        for (int i = 1; i < arr.length; i++) {
            String mark = i % 3 == 2 ? "*" : "#";
            lines[0].append(".").append(mark).append("..");
            lines[1].append(mark).append(".").append(mark).append(".");
            if (lines[2].charAt(lines[2].length() - 1) == '#') {
                lines[2].setLength(lines[2].length() - 1);
                lines[2].append(mark).append(".").append(arr[i]).append(".").append(mark);
            } else {
                lines[2].append(".").append(arr[i]).append(".").append(mark);
            }
            lines[3].append(mark).append(".").append(mark).append(".");
            lines[4].append(".").append(mark).append("..");
        }

        for (StringBuilder line : lines) {
            bw.write(line.toString());
            bw.newLine();
        }
        bw.close();
    }
}
