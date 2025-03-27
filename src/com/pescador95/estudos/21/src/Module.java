package src;

public class Module {

    static Integer ONE_HOUR_IN_MINUTE = 60;

    public static void main(String[] args) {
        module(93);
    }

    static void module(Integer time) {



        Integer hours = time / ONE_HOUR_IN_MINUTE;
        Integer minutes = time % ONE_HOUR_IN_MINUTE;

        System.out.println(hours + " horas e " + minutes + " minutos");
    }
}
