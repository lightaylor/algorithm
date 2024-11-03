package silver.level5.test_1343;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String boards = br.readLine();
        boards = boards.replaceAll("XXXX", "AAAA");
        boards = boards.replaceAll("XX", "BB");

        if (boards.contains("X")) {
            System.out.print(-1);
        } else {
            System.out.print(boards);
        }
    }
}
