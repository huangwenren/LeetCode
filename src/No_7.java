/**
 * Created by huang on 2017/10/10.
 */
public class No_7 {
    public int reverse(int x) {
        long result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x = x / 10;
            if( result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
                return 0;
        }
        return (int)result;
    }


    /*public int reverse(int x) {
        int result = 0;
        int newResult = 0;
        int tail = 0;
        while (x != 0) {
            tail = x % 10;
            newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result) return 0;
            result = newResult;
            x = x / 10;
        }
        return result;
    }*/
    // 当数字较大的时候可能会有问题
    /*public int reverse(int x) {
        String tmp = new Integer(x).toString();
        char[] xArray = tmp.toCharArray();
        StringBuilder sb = new StringBuilder();
        if (xArray[0] == '-') {
            sb.append('-');
            for (int i = xArray.length - 1; i >= 1; i--) {
                sb.append(xArray[i]);
            }
        } else {
            for (int i = xArray.length - 1; i >= 0; i--) {
                sb.append(xArray[i]);
            }
        }
        return Integer.parseInt(sb.toString());
    }*/

    public static void main(String[] args) {
        No_7 no_7 = new No_7();
        System.out.println(no_7.reverse(1534236469));
    }
}
