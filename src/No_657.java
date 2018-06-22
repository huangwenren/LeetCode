/**
 * Created by huang on 2017/10/3.
 */
public class No_657 {
    public boolean judgeCircle(String moves) {
        char[] movesArray = moves.toCharArray();
        int up = 0;
        int down = 0;
        int left = 0;
        int right = 0;
        for (char move : movesArray) {
            switch (move) {
                case 'U':
                    up += 1;
                    break;
                case 'D':
                    down += 1;
                    break;
                case 'L':
                    left += 1;
                    break;
                case 'R':
                    right += 1;
                    break;
            }
        }
        boolean result = false;
        if (up == down && left == right) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
