import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<List<Integer>> arr = new ArrayList<>();

        arr.add(Arrays.asList(1, 2, 3));
        arr.add(Arrays.asList(4, 5, 6));
        arr.add(Arrays.asList(7, 8, 9));

        for (int i = 0; i < arr.size(); i++) {
            List<Integer> row = arr.get(i);
            for (int j = 0; j < row.size(); j++) {
                System.out.print(row.get(j) + " ");
            }
            System.out.println();
        }

        int firstDiaconal = 0;
        int secondDiaconal = 0;

        for (int i = 0; i < arr.size(); i++) {
            firstDiaconal += arr.get(i).get(i);
            secondDiaconal += arr.get(i).get(arr.size() - 1 - i);
        }


        int result = Math.abs(firstDiaconal - secondDiaconal);


        System.out.println(result);
    }
}