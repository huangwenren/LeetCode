import java.util.*;

/**
 * Created by huang on 2017/10/8.
 */
public class No_414 {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if (nums.length < 3) {
            return nums[nums.length - 1];
        }
        int count = 1;
        int tmp = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0 && count < 3; i--) {
            if (nums[i] < tmp) {
                tmp = nums[i];
                count++;
            }
        }
        if (count == 3) {
            return tmp;
        } else {
            return nums[nums.length - 1];
        }
    }

    /*public int thirdMax(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, num);
        }
        Set<Integer> keys = map.keySet();

        List<Integer> result = new ArrayList<>();
        result.addAll(keys);
        Collections.sort(result);

        if (result.size() < 3) {
            return result.get(result.size() - 1);
        } else {
            return result.get(result.size() - 3);
        }
    }*/



    public static void main(String[] args) {
    }
}
