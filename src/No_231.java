/**
 * Created by huang on 2017/10/9.
 */
public class No_231 {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && Integer.bitCount(n) == 1;
    }

    public static void main(String[] args) {
        System.out.println(Integer.bitCount(5));
    }
}
