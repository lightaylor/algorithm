package baekjoon.silver.level4.test_10825;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] input = sc.nextLine().split(" ");
            students.add(new Student(input[0], Integer.parseInt(input[1]), Integer.parseInt(input[2]), Integer.parseInt(input[3])));
        }

        students.sort((s1, s2) -> {
            if (s1.ko != s2.ko) {
                return s2.ko - s1.ko;
            } else if (s1.eng != s2.eng) {
                return s1.eng - s2.eng;
            } else if (s1.math != s2.math) {
                return s2.math - s1.math;
            } else {
                return s1.name.compareTo(s2.name);
            }
        });

        for (Student student : students) {
            System.out.println(student.name);
        }
    }

    static class Student {
        private String name;
        private int ko;
        private int eng;
        private int math;

        public Student(String name, int ko, int eng, int math) {
            this.name = name;
            this.ko = ko;
            this.eng = eng;
            this.math = math;
        }
    }
}
