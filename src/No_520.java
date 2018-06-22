/**
 * Created by huang on 2017/10/5.
 */
public class No_520 {
    public boolean detectCapitalUse(String word) {
        return word.matches("[A-Z]+[a-z]*|[a-z]+");
    }
}
