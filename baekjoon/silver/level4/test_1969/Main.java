package silver.level4.test_1969;

import java.util.Scanner;

public class Main {
    static private String[] arr;
    static private int count;
    static private int n;
    static private int m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        count = 0;
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int[] c = new int[26];
            for (int j = 0; j < n; j++) {
                c[arr[j].charAt(i) - 'A']++;
            }

            int index = 0;
            for (int j = 0; j < c.length; j++) if (c[index] < c[j]) index = j;
            sb.append(Character.toChars(index + 'A'));
        }
        getCount(sb.toString());

        System.out.println(sb);
        System.out.println(count);
    }

    static private void getCount(String word) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (word.charAt(j) != arr[i].charAt(j)) count++;
            }
        }
    }
}
