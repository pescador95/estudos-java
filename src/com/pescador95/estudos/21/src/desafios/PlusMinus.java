package src.desafios;


import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class PlusMinus {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void main(String... args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        PlusMinus.plusMinus(arr);

        bufferedReader.close();
    }

    public static void plusMinus(List<Integer> arr) {

        long positive, negative, neutral;

        positive = arr.stream().filter(x -> x > 0).count();

        negative = arr.stream().filter(x -> x < 0).count();

        neutral = arr.stream().filter(x -> x == 0).count();

        System.out.printf("%.6f\n", (float) positive / arr.size());
        System.out.printf("%.6f\n", (float) negative / arr.size());
        System.out.printf("%.6f\n", (float) neutral / arr.size());

    }

}
