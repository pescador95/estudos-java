package src.bigO;

import java.util.HashSet;
import java.util.Set;

public class PartitionString {

    public static void main(String[] args) {

        String input = "abobrinhao";
        System.out.println(PartitionString(input));
    }

    public static int PartitionString(String word) {

        int number = 0;

        Set<String> verifiedChars = new HashSet<>();

        for (char c : word.toCharArray()) {

            if (verifiedChars.contains(String.valueOf(c))) {
                number++;
                verifiedChars.clear();
            }
            verifiedChars.add(String.valueOf(c));
        }
        return number + 1;
    }
}

