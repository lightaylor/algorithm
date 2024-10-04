package gold.level5.test_11758;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        int crossProduct = (x2 - x1) * (y3 - y2) - (x3 - x2) * (y2 - y1);

        int answer = 0;
        if (crossProduct > 0) {
            answer = 1;
        } else if (crossProduct < 0) {
            answer = -1;
        }

        System.out.print(answer);
        sc.close();
    }
}

/*
    [ 점 2개 외적 계산 ]
    (x1 * y2) - (x2 * y1)

    [ 점 3개 외적 방식 ]
    1. 중간 점을 구함 [x2 - x1, y2 - y1][x3 - x2, y3 - y2]
    2. 점 2개 외적 계산 적용
        (x2 - x1)*(y3 - y2) - (x3 - x2)*(y2 - y1)
*/
