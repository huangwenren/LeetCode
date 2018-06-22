/**
 * Created by huang on 2017/10/16.
 */
public class No_326 {
    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }

    /*public boolean isPowerOfThree(int n) {
        int  Max3PowerInt = 1162261467; // 3^19, 3^20 = 3486784401 > MaxInt32
        int  MaxInt32 = 2147483647; // 2^31 - 1
        if (n <= 0 || n > Max3PowerInt) return false;
        return Max3PowerInt % n == 0;
    }*/

    public static void main(String[] args) {
        System.out.println(Math.pow(3, 19));
    }
}
