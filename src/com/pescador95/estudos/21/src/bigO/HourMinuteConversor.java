package src.bigO;

public class HourMinuteConversor {


    static int HOUR = 60;

    public static void main(String... args) {

        conversor(96);
    }

    public static void conversor(int minutesParam) {

        if (minutesParam > 0) {
            int hour, minutes;

            hour = minutesParam / HOUR;
            minutes = minutesParam % HOUR;
            System.out.printf(minutesParam + " minutes has %d hours and %d minutes", hour, minutes);
        }
    }
}
