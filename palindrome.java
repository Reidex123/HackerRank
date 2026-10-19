import java.util.*;
import java.io.*;

public class palindrome{
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {

            String A = input.next();

            int left = 0;
            int right = A.length() - 1;

            boolean pal = true;

            while (left < right) {
                char l = A.charAt(left);
                char r = A.charAt(right);

                if (l != r) {
                    pal = false;
                }

                left++;
                right--;
            }

            if (pal) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}