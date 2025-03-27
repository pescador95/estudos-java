package src.desafios;

public class kthFactor {

    public static void main(String... args) {
        System.out.println(kthFactor(12, 3));
    }

    public static int kthFactor(int n, int k) {
        int result = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                result++;
                if (result == k) {
                    return i;
                }
            }
        }
        return -1;
    }
}

