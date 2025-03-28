package src.bigO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {

        int maxCandle = Integer.MIN_VALUE;
        int count = 0;

        if (candles.size() == 1) {
            return (int) candles.size();
        }

        for (int candle : candles) {

            if (candle == maxCandle) {
                count++;
            }

            if (candle > maxCandle) {
                maxCandle = candle;
                count = 1;
            }

        }
        return count;
    }


    public static void main(String... args) throws IOException {

        List<Integer> candles = new ArrayList<>();
        candles.add(3);
        candles.add(2);
        candles.add(1);
        candles.add(3);

        System.out.println(birthdayCakeCandles(candles));
    }
}
