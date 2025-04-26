package silver.level4.test_1235;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        String[] numArr = new String[n];
        for (int i = 0; i < n; i++) {
            numArr[i] = sc.nextLine();
        }

        int numLength = numArr[0].length();
        for (int i = 0; i < numLength; i++) {
            Set<String> set = new HashSet<>();
            for (int j = 0; j < n; j++) {
                String str = numArr[j].substring(numLength - (i + 1));
                if (set.contains(str)) break;
                set.add(str);
            }

            if (set.size() == n) {
                System.out.print(i + 1);
                break;
            }
        }
    }
}
