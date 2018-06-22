import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by huang on 2017/10/6.
 */
public class No_506 {
    public String[] findRelativeRanks(int[] nums) {
        String[] result = new String[nums.length];
        int[] tmp = Arrays.copyOf(nums, nums.length);
        Arrays.sort(tmp);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = tmp.length - 1; i >= 0; i--) {
            // score -> ranking
            map.put(tmp[i], tmp.length - i);
        }


        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == 1) {
                result[i] = "Gold Medal";
            } else if (map.get(nums[i]) == 2) {
                result[i] = "Silver Medal";
            } else if (map.get(nums[i]) == 3) {
                result[i] = "Bronze Medal";
            } else {
                result[i] = String.format("%s", map.get(nums[i]));
            }
        }
        return result;
    }

    // 方法二：减少了空间
    /*
    String[] result = new String[nums.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            map.put(nums[i], i);
        }
        Arrays.sort(nums);
        for (int i=0; i<nums.length; i++) {
            if (i == nums.length-1)
                result[map.get(nums[i])] = "Gold Medal";
            else if (i == nums.length-2)
                result[map.get(nums[i])] = "Silver Medal";
            else if (i == nums.length-3)
                result[map.get(nums[i])] = "Bronze Medal";
            else
                result[map.get(nums[i])] = (nums.length - i)+"";
        }
        return result;
     */

    public static void main(String[] args) {
        Integer[] test1 = {0, 1, 2, 3, 4};
        Integer[] test2 = {2, 3, 1, 4, 5};
        Arrays.sort(test1, (a, b) -> (test2[b] - test2[a]));
        for (Integer integer : test1) {
            System.out.println(test2[integer]);
        }
    }
}
