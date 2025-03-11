package gold.level5.test_11664;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ax = sc.nextInt(), ay = sc.nextInt(), az = sc.nextInt();
        int bx = sc.nextInt(), by = sc.nextInt(), bz = sc.nextInt();
        int cx = sc.nextInt(), cy = sc.nextInt(), cz = sc.nextInt();

        int APx = cx - ax, APy = cy - ay, APz = cz - az;
        int ABx = bx - ax, ABy = by - ay, ABz = bz - az;

        double dotAP_AB = APx * ABx + APy * ABy + APz * ABz;
        double dotAB_AB = ABx * ABx + ABy * ABy + ABz * ABz;
        double t = dotAP_AB / dotAB_AB;

        double minDistance;

        if (t < 0) {
            minDistance = Math.sqrt(APx * APx + APy * APy + APz * APz);
        } else if (t > 1) {
            double BCx = cx - bx, BCy = cy - by, BCz = cz - bz;
            minDistance = Math.sqrt(BCx * BCx + BCy * BCy + BCz * BCz);
        } else {
            double crossX = APy * ABz - APz * ABy;
            double crossY = APz * ABx - APx * ABz;
            double crossZ = APx * ABy - APy * ABx;
            double crossMagnitude = Math.sqrt(crossX * crossX + crossY * crossY + crossZ * crossZ);
            double AB_magnitude = Math.sqrt(dotAB_AB);
            minDistance = crossMagnitude / AB_magnitude;
        }

        System.out.printf("%.10f", minDistance);
    }
}
