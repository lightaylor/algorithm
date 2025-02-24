package silver.level5.test_4659;

import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u');

        String s = sc.nextLine();
        while (!s.equals("end")) {
            char[] arr = s.replaceAll("ee", "e").replaceAll("oo", "o").toCharArray();

            boolean check = false;
            int vowelCount = 0, consonantCount = 0;
            for (int i = 0; i < arr.length; i++) {
                char c = arr[i];

                if (i + 1 < arr.length && c == arr[i + 1]) {
                    check = false;
                    break;
                }

                if (set.contains(c)) {
                    consonantCount++;
                    vowelCount = 0;
                    check = true;
                } else {
                    vowelCount++;
                    consonantCount = 0;
                }

                if (consonantCount == 3 || vowelCount == 3) {
                    check = false;
                    break;
                }
            }

            if (check) System.out.printf("<%s> is acceptable.\n", s);
            else System.out.printf("<%s> is not acceptable.\n", s);
            s = sc.nextLine();
        }
    }
}
