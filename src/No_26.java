import java.util.HashMap;
import java.util.Map;

/**
 * Created by huang on 2017/10/11.
 */
public class No_26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return ++j;
    }

    public static void main(String[] args) {
        No_26 no_26 = new No_26();
        int[] nums = {2,2};
        int result = no_26.removeDuplicates(nums);
        System.out.println(result);
    }
}
