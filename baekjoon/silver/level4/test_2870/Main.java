package silver.level4.test_2870;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        List<BigInteger> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (char c : sc.nextLine().toCharArray()) {
                if (Character.isDigit(c)) {
                    sb.append(c);
                } else if (sb.length() > 0) {
                    list.add(new BigInteger(sb.toString()));
                    sb.setLength(0);
                }
            }
            if (sb.length() > 0) list.add(new BigInteger(sb.toString()));
        }
        list.sort(BigInteger::compareTo);
        for (BigInteger i : list) System.out.println(i);
    }
}
