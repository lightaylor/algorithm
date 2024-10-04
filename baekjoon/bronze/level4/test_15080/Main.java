package bronze.level4.test_15080;

import java.io.*;
import java.text.ParseException;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H : m : s");

        LocalTime start = LocalTime.parse(br.readLine(), formatter);
        LocalTime end = LocalTime.parse(br.readLine(), formatter);

        long diff;
        if (end.isBefore(start)) {
            diff = Duration.between(start, LocalTime.MAX).toSeconds() +
                    Duration.between(LocalTime.MIN, end).toSeconds() + 1;
        } else {
            diff = Duration.between(start, end).toSeconds();
        }

        bw.write(String.valueOf(diff));
        bw.close();
    }
}
