package bronze.level3.test_3029;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime start = LocalTime.parse(sc.nextLine(), formatter);
        LocalTime end = LocalTime.parse(sc.nextLine(), formatter);

        Duration d = Duration.between(start, end)
            .plusSeconds(!end.isAfter(start) ? 24 * 3600 : 0);
        System.out.printf("%02d:%02d:%02d", d.toHours(), d.toMinutesPart(), d.toSecondsPart());

    }
}
