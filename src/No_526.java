/**
 * Created by huang on 2017/10/5.
 */
public class No_526 {

    public int countArrangement(int N) {
        if (N == 0) return 0;
        int[] array = new int[N + 1];
        beautifulArrangement(N, array);
        return array[0];
    }

    private void beautifulArrangement(int N, int[] array) {
        if (N == 1) {
            array[0]++;
            return;
        }

        for (int pos = 1; pos < array.length; pos++) {
            if (array[pos] == 0 && (N % pos == 0 || pos % N == 0)) {
                array[pos] = N;
                beautifulArrangement(N - 1, array);
                array[pos] = 0;
            }
        }
    }
}
