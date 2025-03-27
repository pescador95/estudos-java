package src.desafios;

import java.io.*;
import java.util.*;

import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CompareTriplets {
    public static void main(String... args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\temp\\output.txt"));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(result.stream()
                        .map(Object::toString)
                        .collect(joining(" ")));

        bufferedReader.close();
        bufferedWriter.close();
    }

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int resultA = 0;
        int resultB = 0;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < 2; i++) {

            if (a.get(i) > b.get(i)) {
                resultA ++;
            }

            if(a.get(i) < b.get(i)) {
                resultB ++;
            }

        }
        result.add(resultA);
        result.add(resultB);
        return result;
    }

}
