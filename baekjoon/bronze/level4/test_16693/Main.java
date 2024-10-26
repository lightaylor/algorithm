package bronze.level4.test_16693;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int P1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int W = Integer.parseInt(st.nextToken());
        int P2 = Integer.parseInt(st.nextToken());
        double perPiece = W * W * Math.PI / A;

        if (P2 / perPiece < P1) {
            System.out.print("Whole pizza");
        } else {
            System.out.print("Slice of pizza");
        }
    }
}
