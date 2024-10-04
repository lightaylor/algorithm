package bronze3.test_2525;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String time = br.readLine();
        int add = Integer.parseInt(br.readLine());

        SimpleDateFormat sdf = new SimpleDateFormat("H m");
        Date date = sdf.parse(time);

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MINUTE, add);

        bw.write(sdf.format(cal.getTime()));
        bw.close();
    }
}
