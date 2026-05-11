public class decompress {
    public static void main(String[] args) {
        try (java.util.Scanner input = new java.util.Scanner(System.in)) {
            System.out.println("Enter text to decompress: ");
            String text = input.nextLine();

            for (int i = 0; i < text.length(); i+=2) {
                char c = text.charAt(i);

                if (!Character.isDigit(c)) {
                    System.out.print(c);
                    continue;
                }

                if (Character.isDigit(c) && i + 1 != text.length()) {
                    System.out.print(text.substring(i+1, i+2).repeat(Integer.parseInt(Character.toString(c))));
                }
                else {
                    System.out.print(text.substring(i, i).repeat(Integer.parseInt(Character.toString(c))));
                }
            }
        }
    }
}