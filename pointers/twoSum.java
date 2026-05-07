// Implentation of the two sum problem using 2 pointers
// Assuming the array is already sorted

package pointers;

public class twoSum {

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

        int left = 0;
        int right = intArr.length - 1;

        while (left < right) {
            int sum = intArr[left] + intArr[right];

            if (sum == target) {
                System.out.println("Values = " + intArr[left] + " and " + intArr[right]);
                return true;
            }
            if (sum > target) {
                right--;
            } else {
                left--;
            }
        }

        return false;
    }

}
