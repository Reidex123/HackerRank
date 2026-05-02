public class recSeries {

    public static void series(int a, int b, int n) {

        int sum = 0;
        for (int i = 0; i < n; i++) {

            sum += (a + (int) Math.pow(2, i) * b);
            System.out.print(sum + " ");

        }

    }
    public static void main(String[] args){

        try (java.util.Scanner input = new java.util.Scanner(System.in)) {

            int t = input.nextInt();
            for (int i = 0; i < t; i++) {
                int a = input.nextInt();
                int b = input.nextInt();
                int n = input.nextInt();

                series(a, b, n);
            }
        }
    }
}