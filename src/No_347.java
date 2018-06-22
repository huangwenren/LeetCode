import java.util.*;

/**
 * Created by huang on 2017/10/9.
 */
public class No_347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        List[] frequency = new List[countMap.size() + 1];
        for (Integer key : countMap.keySet()) {
            if (frequency[countMap.get(key)] == null) {
                frequency[countMap.get(key)] = new ArrayList<Integer>();
                frequency[countMap.get(key)].add(key);
            } else {
                frequency[countMap.get(key)].add(key);
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = frequency.length - 1; i >= 0 && result.size() < k; i--) {
            if (frequency[i] != null) {
                result.addAll(frequency[i]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        No_347 no_347 = new No_347();
        int[] nums = {4, 1, -1, 2, -1, 2, 3};
        List<Integer> result = no_347.topKFrequent(nums, 2);
        System.out.println(result);
    }
}
