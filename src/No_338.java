/**
 * Created by huang on 2017/10/16.
 */
public class No_338 {
    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        for (int i = 0; i < result.length; i++) {
            // result[i] = result[i / 2] + i % 1;
            result[i] = result[i >> 2] + (i & 1);
        }
        return result;
    }

    // 该方法效率不够高
    /*public int[] countBits(int num) {
        int[] result = new int[num + 1];
        for (int j = 0; j <= num; j++) {
            int i = j;
            int tmp = 0;
            while (i != 0) {
                // i % 2
                tmp += i & 1;
                // i / 2
                i = i >> 1;
            }
            result[j] = tmp;
        }

        return result;
    }*/

    public static void main(String[] args) {
        System.out.println(Integer.bitCount(3));

    }
}
