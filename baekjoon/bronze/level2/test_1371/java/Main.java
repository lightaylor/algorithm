package bronze.level2.test_1371.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] alphabet = new int[26];
        int max = 0;
        while (sc.hasNext()) {
            String line = sc.nextLine().replaceAll(" ", "");
            char[] arr = line.toCharArray();
            for (char c : arr) {
                alphabet[c - 'a']++;
                max = Math.max(alphabet[c - 'a'], max);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == max) sb.append(Character.toChars(i + 'a'));
        }
        System.out.print(sb);
    }
}
