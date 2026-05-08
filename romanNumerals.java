import java.util.*;

public class romanNumerals {

    private static Map<Character, Integer> romanMap = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    private static int romanNum(String s) {
        int total = 0;

        for (int i = 0; i < s.length(); i++)
        {
            int current = romanMap.get(s.charAt(i));

            if (i + 1 < s.length() && current < romanMap.get(s.charAt(i))) {
                total -= current;
            } else {
                total += current;
            }
        }

        return total;
    }
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Enter roman numeral: ");
            String s = input.nextLine();

            int num = romanNum(s);

            System.out.println("Results = " + num);
        }
    }
}