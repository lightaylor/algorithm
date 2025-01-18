package bronze.level1.test_11557;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        String university = "";
        int count = 0;
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(sc.nextLine());

            for (int j = 0; j < m; j++) {
                String[] arr = sc.nextLine().split(" ");

                if (count < Integer.parseInt(arr[1])) {
                    university = arr[0];
                    count = Integer.parseInt(arr[1]);
                }
            }

            System.out.println(university);
        }
    }
}
