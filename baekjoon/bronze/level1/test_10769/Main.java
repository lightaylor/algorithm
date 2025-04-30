package bronze.level1.test_10769;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] message = sc.nextLine().split(":-");

        int sad = 0;
        int happy = 0;
        for (String str : message) {
            if (!str.isEmpty()) {
                sad += str.charAt(0) == '(' ? 1 : 0;
                happy += str.charAt(0) == ')' ? 1 : 0;
            }
        }

        System.out.print(sad + happy == 0 ? "none" : (sad == happy ? "unsure" : (sad > happy ? "sad" : "happy")));
    }
}
