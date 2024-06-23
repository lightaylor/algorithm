package silver5.test_25206;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        double total = 0, creditSum = 0;

        while (input != null) {
            String[] str = input.split(" ");
            double credit = Double.parseDouble(str[str.length - 2]);
            String grade = str[str.length - 1];

            switch (grade) {
                case "A+":
                    total += credit * 4.5;
                    creditSum += credit;
                    break;
                case "A0":
                    total += credit * 4.0;
                    creditSum += credit;
                    break;
                case "B+":
                    total += credit * 3.5;
                    creditSum += credit;
                    break;
                case "B0":
                    total += credit * 3.0;
                    creditSum += credit;
                    break;
                case "C+":
                    total += credit * 2.5;
                    creditSum += credit;
                    break;
                case "C0":
                    total += credit * 2.0;
                    creditSum += credit;
                    break;
                case "D+":
                    total += credit * 1.5;
                    creditSum += credit;
                    break;
                case "D0":
                    total += credit;
                    creditSum += credit;
                    break;
                case "F":
                    creditSum += credit;
                    break;
            }
            input = br.readLine();
        }
        bw.write(Double.toString(total / creditSum));
        bw.close();
    }
}
