public class sum {
    public static void main(String[] args) {

        System.out.println(result("Rbdhdh888888#%^^d56gaj%&677×&#:#&@0vgs12"));
    }

    public static int result(String s) {

        int total = 0;
        StringBuilder str = new StringBuilder();

        if (Character.isDigit(s.charAt(0))) {
            str.append(s.charAt(0));
        }

        for (int i = 1; i < s.length(); i++) {
            Character c = s.charAt(i);

            if (Character.isDigit(c)) {
                str.append(c);
                continue;
            }

            if (Character.isDigit(s.charAt(i - 1)) && !Character.isDigit(c)) {
                total += Integer.parseInt(str.toString());
                str = new StringBuilder();
            }
        }

        total += Integer.parseInt(str.toString());

        return total;
    }
}
