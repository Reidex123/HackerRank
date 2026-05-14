import java.util.*;
import static java.util.Map.entry;

public class validParenthesis {

    static final Map<Character, Character> map = Map.ofEntries(
        entry(')', '('),
        entry(']', '['),
        entry('')
    );
    public static void main(String[] args) {
        System.out.println(valid("()[]{}")); // true
        System.out.println(valid("([)]"));
    }

    public static boolean valid(String s) {



        return false;
    }
}