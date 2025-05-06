package bronze.level2.test_2386;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        
        int n = 0;
        while(!str.equals("#")) {
            char c = str.charAt(0);
            String arr = str.substring(1).replaceAll(" ", "");
            int origin = arr.length();
            int changed = arr.replaceAll(String.valueOf(c), "").length();
            n = origin - changed;
            
            System.out.println(c + " " + n);
        
            str = sc.nextLine().toLowerCase();
        }
    }
}
