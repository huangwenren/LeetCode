/**
 * Created by huang on 2017/10/15.
 */
public class No_258 {
    public int addDigits(int num) {
        int sum = num;
        while (sum > 9) {
            sum = getSum(sum);
        }
        return sum;
    }

    public int getSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
