package bronze.level1.test_6996;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] str = sc.nextLine().split(" ");
            int[] alphabet = new int[26];

            for (char c : str[0].toCharArray()) alphabet[c - 'a']++;
            for (char c : str[1].toCharArray()) alphabet[c - 'a']--;

            boolean bool = true;
            for (int a : alphabet) {
                if (a != 0) {
                    bool = false;
                    break;
                }
            }
            if (bool) System.out.printf("%s & %s are anagrams.\n", str[0],
                str[1]);
            else
                System.out.printf("%s & %s are NOT anagrams.\n", str[0], str[1]);
        }
    }
}
