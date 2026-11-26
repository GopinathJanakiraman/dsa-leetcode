import java.util.HashSet;
import java.util.Set;
/*
 * Approach
 *
 * 1. left,right same start 0
 * 2. if set contains char remove add left counter
 * 3. move right alone and add char and calculate window right-left
 *
 *
 * */
public class LongestSubstringWithoutRepeatingChar {

    public static void main(String[] args) {
        String str = "pwwkew";
        int left = 0;
        int right = 0;
        int maxlen = Math.min(str.length(),1);
        Set<Character> hs = new HashSet<>();
        while (right < str.length()) {

            char c = str.charAt(right);
            System.out.println(hs);
            while (hs.contains(c)) {
                hs.remove(str.charAt(left));
                left++;
            }
            hs.add(c);

            int windowLen = right - left + 1;
            maxlen = Math.max(windowLen, maxlen);
            right++;
        }



        System.out.println(maxlen);
    }

}
