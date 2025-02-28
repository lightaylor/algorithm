package bronze.level1.test_2810.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        char[] seats = sc.nextLine().toCharArray();

        int cupCount = 1;
        int personCount = 0;
        for (int i = 0; i < n; i++) {
            if (seats[i] == 'S') {
                cupCount++;
                personCount++;
            } else {
                personCount+=2;
                i++;
                cupCount++;
            }
        }

        System.out.print(Math.min(cupCount, personCount));
    }
}
