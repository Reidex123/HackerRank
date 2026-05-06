// A program to reverse the string in place without using any extra memory
package pointers;

public class reverseString {

    public static void main(String[] args) {
        try (java.util.Scanner input = new java.util.Scanner(System.in)) {

            System.out.println("Enter the word to reverse: ");
            String word = input.nextLine();

            String result = reverse(word.toCharArray());

            System.out.println("Reversed word = " + result);
        }
    }

    private static String reverse(char[] letter) {

        int left = 0;
        int right = letter.length - 1;

        while (left < right) {

            char temp = letter[left];
            letter[left] = letter[right];
            letter[right] = temp;

            left++;
            right--;
        }

        return new String(letter);
    }
}
