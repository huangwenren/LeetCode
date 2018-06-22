/**
 * Created by huang on 2017/10/16.
 */
public class No_342 {
    public boolean isPowerOfFour(int num) {
        return num > 0 && 1073741824 % num == 0;
    }

    public static void main(String[] args) {
        System.out.println(Math.pow(4, 15));
    }
}
