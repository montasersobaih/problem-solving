package URI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class EventTime {
    public static void main(String[] args) throws Exception {

        BufferedReader b = new BufferedReader(new FileReader("Input"));
        StringTokenizer string = new StringTokenizer(b.readLine());

        string.nextToken();
        String str = String.format("%02d", Integer.parseInt(string.nextToken()));
        String dateStart = "00/" + str + "/0000 " + b.readLine().replace(" ", "");

        string = new StringTokenizer(b.readLine());
        string.nextToken();
        str = String.format("%02d", Integer.parseInt(string.nextToken()));
        String dateStop = "00/" + str + "/0000 " + b.readLine().replace(" ", "");

        //HH converts hour in 24 hours format (0-23), day calculation
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

        Date d1 = null;
        Date d2 = null;

        d1 = format.parse(dateStart);
        d2 = format.parse(dateStop);

        //in milliseconds
        long diff = d2.getTime() - d1.getTime();

        long diffSeconds = diff / 1000 % 60;
        long diffMinutes = diff / (60 * 1000) % 60;
        long diffHours = diff / (60 * 60 * 1000) % 24;
        long diffDays = diff / (24 * 60 * 60 * 1000);

        System.out.printf("%d dia(s)\n", diffDays);
        System.out.printf("%d hora(s)\n", diffHours);
        System.out.printf("%d minuto(s)\n", diffMinutes);
        System.out.printf("%d segundo(s)\n", diffSeconds);

    }
}