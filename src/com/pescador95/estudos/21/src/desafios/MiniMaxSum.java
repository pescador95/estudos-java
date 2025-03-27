package src.desafios;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.stream.LongStream;

class MiniMaxSum {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void main(String... args) throws IOException {

        List<Integer> param = new ArrayList<>();
        param.add(256741038);
        param.add(623958417);
        param.add(467905213);
        param.add(714532089);
        param.add(938071625);

        miniMaxSum(param);

    }

    public static void miniMaxSum(List<Integer> arr) {

        Collections.sort(arr);
        Long min, max;

        min = LongStream.range(0, 4).map(i -> arr.get((int)i)).sum();
        max = LongStream.range(1, 5).map(i -> arr.get((int)i)).sum();

        System.out.print(min + " " + max);
    }
}
