package backTracking;

public class subString {

    public static java.util.List<String> permStrings = new java.util.ArrayList<>();

    public static String getSmallestAndLargest(String s, int k) {
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        permute("", s, k);
        java.util.Collections.sort(permStrings);

        return permStrings.toString();
    }

    private static void permute(String prefix, String s, int k) {

        if (prefix.length() == k) {
            permStrings.add(prefix);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            permute(prefix + s.charAt(i), s.substring(0, i) + s.substring( i+1), k);
        }
    }


    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
