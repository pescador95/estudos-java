package src.desafios;

public class FizzBuzz {

    public static void main(String[] args) {


       fizzBuzz(15);
    }

        static String FIZZ = "Fizz";
        static String BUZZ = "Buzz";
        static String FIZZBUZZ = "FizzBuzz";


        /*
         * Complete the 'fizzBuzz' function below.
         *
         * The function accepts INTEGER n as parameter.
         */

        public static void fizzBuzz(int n) {
            // Write your code here

            for (int i=1; i <= n; i++) {

                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(FIZZBUZZ);
                    continue;
                }

                if (i % 3 == 0) {
                    System.out.println(FIZZ);
                    continue;
                }

                if (i % 5 == 0) {
                    System.out.println(BUZZ);
                    continue;
                }

                System.out.println(i);
            }

        }
}
