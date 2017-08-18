package lesson9;

import lesson9.models.Report;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Dorin Popa
 */
public class Main {
    // Vasea kidoncik fara kipizdoncik
    private static List<Report> report;
    private static String trackingNumber;
    private static int reportNr;

    public static void main(String[] args) throws IOException {

        report = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert tracking number: ");
        trackingNumber = scanner.nextLine();

        String defaultURL = "http://www.posta.md/en/tracking?id=RB295349616SG";/*RS916319658NL*/
        int indexTrackingNumber = defaultURL.indexOf("=");

        String defaultTrackingNumber = defaultURL.substring(indexTrackingNumber + 1);

        String url = defaultURL.replace(defaultTrackingNumber, trackingNumber);

        URL postaMoldovei = new URL(url);
        URLConnection connection = postaMoldovei.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));


        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            if (inputLine.contains("class=\"row clearfix\"")) {
                inputLine = in.readLine();
                String localDate = parseLine(inputLine);

                inputLine = in.readLine();
                String country = parseLine(inputLine);

                inputLine = in.readLine();
                String location = parseLine(inputLine);

                inputLine = in.readLine();
                String eventType = parseLine(inputLine);

                inputLine = in.readLine();
                String extraInfo = parseLine(inputLine);

                report.add(new Report(localDate, country, location, eventType, extraInfo));
            }
        }
        in.close();

        System.out.println(report);
    }

    private static String parseLine(String inputLine) {
//        int initial = inputLine.indexOf('>') + 1;
//        int finish = inputLine.lastIndexOf('<');
//
//        return inputLine.substring(initial, finish);
        return StringUtils.substringBetween(inputLine, ">", "<");
        // asta mai pizdoasa solutie folosind biblioteca org.apache.commons.lang3.StringUtils
    }


}