package baekjoon.bronze.level5.test_28691;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        String answer = "";
        switch (word) {
            case "M":
                answer = "MatKor";
                break;
            case "W":
                answer = "WiCys";
                break;
            case "C":
                answer = "CyKor";
                break;
            case "A":
                answer = "AlKor";
                break;
            case "$":
                answer ="$clear";
                break;
        }

        System.out.print(answer);
    }
}
