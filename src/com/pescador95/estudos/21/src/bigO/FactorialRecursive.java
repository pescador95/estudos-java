package src.bigO;


public class FactorialRecursive {

    public static void main(String[] args) {

        int number = 9;

        executeFactorial(number);

        String str = "ABCD";
        int n = str.length();

        executePermute(str, 0, n - 1);
    }

    //     //        Time complexity: o(n^2)
    //    //        Space complexity: o(n)
    public static void executeFactorial(int number) {
        System.out.println("The factorial of " + number + " is: ");


        while (number > 0) {

            System.out.println(factorial(number));
            number--;
        }
    }

    //     //        Time complexity: o(n * n!)
    //    //        Space complexity: o(n)
    public static void executePermute(String str, int l, int r) {
        permute(str, l, r);
    }


    public static Long factorial(long number) {

        if (number == 0L) {
            return 1L;
        }

        return number * factorial(number - 1);
    }

    public static void permute(String str, int l, int r) {

        if (l == r) {
            System.out.println(str);
        } else {

            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    public static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
