package gold.level3.test_1644;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n; i++) if (isPrime(i)) list.add(i);

        int start = 0;
        int end = start + 1;
        int count = 0;
        int sum = list.get(start);
        while (true) {
            if (sum >= n) {
                if (sum == n) count++;
                sum -= list.get(start++);
            } else {
                if (end == list.size()) break;
                sum += list.get(end++);
            }
        }

        System.out.print(count);
    }

    private static boolean isPrime(int n) {
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) if (n % i == 0) return false;
        return true;
    }
}

