import java.util.HashMap;
import java.util.Map;

/**
 * Created by huang on 2017/10/5.
 */
public class No_535 {
    // Encodes a URL to a shortened URL.
    Map<Integer, String> urls = new HashMap<>();

    public String encode(String longUrl) {
        String tinyUrl = "http://tinyurl.com/" + longUrl.hashCode();
        urls.put(longUrl.hashCode(), longUrl);
        return tinyUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        Integer hashcode = Integer.valueOf(shortUrl.replace("http://tinyurl.com/", ""));
        return urls.get(hashcode);
    }

    public static void main(String[] args) {
        No_535 no_535 = new No_535();

        String result = no_535.decode("http://tinyurl.com/-1163677885");
        System.out.println(result);
    }
}
