import java.util.ArrayList;
import java.util.List;

/**
 * Created by huang on 2017/10/5.
 */
public class No_442 {
    public List<Integer> findDuplicates(int[] nums) {
        // 1 ≤ a[i] ≤ n (n = size of array),
        // some elements appear twice and others appear once
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            // 数组的长度为n，所以下标最多为n-1
            int index = Math.abs(num) - 1;
            if (nums[index] < 0) {
                result.add(Math.abs(num));
            }
            nums[index] = -nums[index];
        }
        return result;
    }
}
