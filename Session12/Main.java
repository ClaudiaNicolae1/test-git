package Session12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        displayCurrentTime();
        System.out.println();
        displayTodaysDate();

        Date date = new Date();
        System.out.println();
        displayDateComponents(date);
        System.out.println();

        System.out.print("Enter the first date (YYYY-MM-DD): ");
        String date1 = scanner.nextLine();
        System.out.print("Enter the second date (YYYY-MM-DD): ");
        String date2 = scanner.nextLine();
        boolean equal = areDatesEqual(date1,date2);
        System.out.println(equal);

        System.out.println();
        System.out.print("Enter a date to check if it's today's date (YYYY-MM-DD): ");
        String day = scanner.nextLine();
        boolean equals = isTodaySpecificDate(day);
        System.out.println(equals);
        String myDateString = "2023-09-11";
        System.out.println();
        System.out.println("2023-09-11 was : " + findDayOfWeek(myDateString));

        System.out.println();
        System.out.print("Enter the first date (YYYY-MM-DD): ");
        String date3 = scanner.nextLine();
        System.out.print("Enter the second date (YYYY-MM-DD): ");
        String date4 = scanner.nextLine();
        long days = daysBetween(date3, date4);
        System.out.println( "Days between: " + days);

        String priorTime = "12:30:45";
        String elapsedTime = elapsedTimeSince(priorTime);
        System.out.println(elapsedTime);
        //ultimul exercitiu este de pe chatgpt
    }

    public static void displayCurrentTime(){
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(time.format(dateTimeFormatter));
    }
    public static void displayTodaysDate(){
        LocalDateTime nowLocal = LocalDateTime.now();
        System.out.println(nowLocal);
    }

    public static void displayDateComponents(Date date){
        String formatDate = "MMM-yyyy-dd H:m";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatDate);
        System.out.println(simpleDateFormat.format(date));
    }

    public static boolean areDatesEqual(String date, String date1) throws ParseException{
        String formatDate = "YYYY-MM-DD";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatDate);
        Date myDate = simpleDateFormat.parse(date);
        Date myDate1 = simpleDateFormat.parse(date1);
        return myDate.equals(myDate1);
    }

    public static boolean isTodaySpecificDate(String date) throws ParseException{
        String formatDate = "YYYY-MM-DD";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatDate);
        LocalDate localDate = LocalDate.now();
        Date myDate = simpleDateFormat.parse(date);
        return localDate.equals(myDate);
    }
    public static String findDayOfWeek(String date) throws ParseException{
        LocalDate localDate = LocalDate.parse(date);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        return dayOfWeek.toString();
    }

    public static long daysBetween(String date, String date1){
        LocalDate localDate = LocalDate.parse(date);
        LocalDate localDate1 = LocalDate.parse(date1);
        return Math.abs(localDate.until(localDate1).getDays()); //am luat de pe net
    }
    public static String elapsedTimeSince(String priorTime){
        Date currentTime = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Date startTime;
        try {
            startTime = sdf.parse(priorTime);
        } catch (ParseException e) {
            e.printStackTrace();
            return "Invalid time format";
        }

        long elapsedTimeMillis = currentTime.getTime() - startTime.getTime();
        long hours = elapsedTimeMillis / (60 * 60 * 1000);
        long minutes = (elapsedTimeMillis % (60 * 60 * 1000)) / (60 * 1000);
        long seconds = (elapsedTimeMillis % (60 * 1000)) / 1000;
        String result = hours + " hours, " + minutes + " minutes, " + seconds + " seconds";

        return result;
    }
}
