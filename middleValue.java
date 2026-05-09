public class middleValue {
    public static void main(String[] args) {
        try (java.util.Scanner input = new java.util.Scanner(System.in)) {

            int N = input.nextInt();
            for (int i = 0; i < N; i++) {
                int X = input.nextInt();
                int Y = input.nextInt();
                int Z = input.nextInt();

                int[] arr = { X, Y, Z };
                int result = middle(arr);

                System.out.println("middle value = " + result);
            }
        }
    }

    static int middle(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (left + 1 == right && arr[left] < arr[right]) {
                return arr[left];
            }

            if (arr[left] < arr[right]) {
                left++;
            }
            else {
                right++;
            }
        }

        return arr[left];
    }
}
