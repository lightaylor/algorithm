package silver.level3.test_22233;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) set.add(sc.nextLine());

        for (int i = 0; i < M; i++) {
            String[] word = sc.nextLine().split(",");
            for (String w : word) set.remove(w);
            System.out.println(set.size());
        }
    }
}
