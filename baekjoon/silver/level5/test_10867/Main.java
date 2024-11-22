package silver.level5.test_10867;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        TreeSet<Integer> set = new TreeSet<>();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            set.add(sc.nextInt());
        }

        StringBuffer sb = new StringBuffer();
        for (int i : set) {
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
