package baekjoon.gold.level2.test_7869;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c1 = new Circle(sc);
        Circle c2 = new Circle(sc);
        System.out.printf("%.3f", circleIntersectionArea(c1, c2));
    }

    private static double circleIntersectionArea(Circle c1, Circle c2) {
        double x = c2.x - c1.x;
        double y = c2.y - c1.y;
        double d = Math.sqrt(x * x + y * y);
        double result = 0.0;

        if (Math.abs(c1.r - c2.r) >= d) {
            result = Math.PI * Math.min(c1.r, c2.r) * Math.min(c1.r, c2.r);
        } else if (c1.r + c2.r > d) {
            double cosTheta1 = (c1.r * c1.r + d * d - c2.r * c2.r) / (2 * c1.r * d);
            double cosTheta2 = (c2.r * c2.r + d * d - c1.r * c1.r) / (2 * c2.r * d);

            cosTheta1 = Math.max(-1, Math.min(1, cosTheta1));
            cosTheta2 = Math.max(-1, Math.min(1, cosTheta2));

            double theta1 = Math.acos(cosTheta1);
            double theta2 = Math.acos(cosTheta2);

            double w1 = (c1.r * c1.r * theta1) - (c1.r * c1.r * Math.sin(2 * theta1) / 2);
            double w2 = (c2.r * c2.r * theta2) - (c2.r * c2.r * Math.sin(2 * theta2) / 2);
            result = w1 + w2;
        }

        return result;
    }
}

class Circle {
    double x, y, r;

    public Circle(Scanner sc) {
        this.x = sc.nextDouble();
        this.y = sc.nextDouble();
        this.r = sc.nextDouble();
    }
}
