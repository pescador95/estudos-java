package src.desafios;

public class DnaTest {


        /*
         * Complete the 'dnaComplement' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts STRING s as parameter.
         */

        public static String dnaComplement(String s) {
            // Write your code here

            char[] dnaArr = s.toCharArray();
            int lowP = 0;
            int highP = s.length() - 1;

            while (lowP <= highP) {

                char tempLow = dnaArr[lowP];
                char tempHigh = dnaArr[highP];

                dnaArr[lowP] = (tempHigh == 'A') ? 'T' : (tempHigh == 'T') ? 'A' : (tempHigh == 'C') ? 'G' : 'C';
                dnaArr[highP] = (tempLow == 'A') ? 'T' : (tempLow == 'T') ? 'A' : (tempLow == 'C') ? 'G' : 'C';

                lowP++;
                highP--;
            }

            return new String(dnaArr);
        }
    }