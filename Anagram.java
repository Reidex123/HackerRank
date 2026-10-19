
import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();

        java.util.Map<Character, Integer> map1 = new java.util.HashMap<Character, Integer>();
        java.util.Map<Character, Integer> map2 = new java.util.HashMap<Character, Integer>();
        // assuming len of a and b is the same
        for (int i = 0; i < a.length(); i++) {
            Character c = new Character(a.charAt(i));

            if (map1.containsKey(c)) {
                map1.replace(c, map1.get(c), map1.get(c) + 1);
            } else {
                map1.put(c, 1);
            }
        }

        for (int i = 0; i < b.length(); i++) {
            Character c = new Character(b.charAt(i));

            if (map2.containsKey(c)) {
                map2.replace(c, map2.get(c), map2.get(c) + 1);
            } else {
                map2.put(c, 1);
            }
        }

        return map1.equals(map2);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
