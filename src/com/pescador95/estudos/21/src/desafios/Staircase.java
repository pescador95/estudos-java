package src.desafios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Staircase {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void main(String... args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = 100;

        staircase(n);

        bufferedReader.close();
    }

    public static void staircase(int n) {

        if (n > 0 && n <= 100) {
            for (int i = 1; i <= n; i++) {
                String spaces = " ".repeat(n - i);
                String degree = "#".repeat(i);
                System.out.println(spaces + degree);
            }
        }
    }

}