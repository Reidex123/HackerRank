public class compress{
    public static void main(String[] args) {

        try (java.util.Scanner input = new java.util.Scanner(System.in)) {
            System.out.println("Enter text to compress:");
            String text = input.nextLine();

            int i = 0;
            while( i < text.length()) {

                int start = text.indexOf(Character.toString(text.charAt(i)));
                int end = text.lastIndexOf(Character.toString(text.charAt(i)));

                int len = end - start + 1;

                System.out.print(len + Character.toString(text.charAt(i)));

                i = end + 1;
            }
        }
    }
}