package src.bigO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaiorFrequenciaK {

    public static void main(String... args) {

        int[] intArray = {1, 1, 1, 2, 2, 3};
        int k = 2;

        System.out.println("Os k elementos mais frequentes são: " + maiorFrequenciaK(intArray, k));
    }

    public static List<Integer> maiorFrequenciaK(int[] nums, Integer k) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<List<Integer>> buckets = new ArrayList<>(nums.length + 1);
        for (int i = 0; i <= nums.length; i++) {
            buckets.add(new ArrayList<>());
        }
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            buckets.get(entry.getValue()).add(entry.getKey());
        }

        List<Integer> result = new ArrayList<>();
        for (int i = buckets.size() - 1; i >= 0 && result.size() < k; i--) {
            for (Integer num : buckets.get(i)) {
                result.add(num);
                if (result.size() == k) {
                    break;
                }
            }
        }

        return result;
    }
}
