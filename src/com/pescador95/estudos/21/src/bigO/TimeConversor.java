package src.bigO;

public class TimeConversor {

    public static void main(String[] args) {

        String s = "09:05:45PM";
        System.out.println(timeConversion(s));
    }

    public static String timeConversion(String s) {

        String format = s.substring(s.length() - 2);

        String[] time = s.substring(0, s.length() - 2).split(":");

        int hour = Integer.parseInt(time[0]);

        if (format.equals("PM")) {
            if (hour != 12) {
                hour += 12;
            }
        }

        if (format.equals("AM")) {
            if (hour == 12) {
                hour = 0;
            }
            if (hour > 12) {
                hour -= 12;
            }
        }
        return String.format("%02d:%s:%s", hour, time[1], time[2]);
    }
}
