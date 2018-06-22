import java.util.HashSet;
import java.util.Set;

/**
 * Created by huang on 2017/10/15.
 */
public class No_3 {
    public int lengthOfLongestSubstring(String s) {
        char[] tmp = s.toCharArray();
        Set<Character> set = new HashSet<>();
        int max = 0;
        int i = 0;
        int j = 0;

        while (i<tmp.length){
            if (!set.contains(tmp[i])) {
                set.add(tmp[i++]);
                max = Math.max(max, set.size());
            } else {
                set.remove(tmp[j++]);
            }
        }

        return max;
    }
}
