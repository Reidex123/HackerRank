// Implentation of the two sum problem using HashSet
// Also works on an unsorted array
package pointers;

public class twoSum2 {

    public static void main(String[] args) {

        try (java.util.Scanner input = new java.util.Scanner(System.in)) {

            System.out.println("Input array of integers (separated by space): ");
            String[] array = input.nextLine().split(" ");

            int[] intArr = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                intArr[i] = Integer.parseInt(array[i]);
            }

            System.out.println("Enter target: ");
            int target = input.nextInt();

            if (result(target, intArr)) {
                System.out.println("found");
            } else {
                System.out.println("not found");
            }
        }
    }

    private static boolean result(int target, int[] intArr) {
        // more faster than using two pointers

        java.util.Set<Integer> seen = new java.util.HashSet<>();

        for (int num : intArr) {

            int complement = target - num;

            if (seen.contains(complement)) {
                return true;
            }

            seen.add(num);
        }

        return false;
    }

}
