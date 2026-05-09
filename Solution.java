
import java.util.*;

class Solution {

    public static int lengthOfLongestSubstring(String s) {

        if (s.length() == 0) {
            return 0;
        } else if (s.length() == 1) {
            return 1;
        }

        int current = 0;
        List<Character> chars = new ArrayList<>();
        chars.add(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            Character c = s.charAt(i);

            if (chars.contains(c)) {
                current = chars.size();
                chars = new ArrayList<>();
                chars.add(c);
            } else {
                chars.add(c);
            }

            if (chars.size() > current) {
                current = chars.size();
            }
        }

        return current;
    }

    public static void main(String[] args) {
        int results = lengthOfLongestSubstring("abcabcbb");
        System.out
    }
}