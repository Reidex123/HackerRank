public class recSeries {

    public static void series(int a, int b, int n) {

        int sum = a;
        for (int i = 0; i < n; i++) {

            sum += ((int) Math.pow(2, i) * b);
            System.out.print(sum + " ");

        }

        System.out.println();
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